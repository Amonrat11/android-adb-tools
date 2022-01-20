package ru.nikita.adb;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.List;
import ru.nikita.adb.Device;

class DeviceListAdapter extends BaseAdapter {
	DeviceListAdapter(Context context, List<Device> devices){
		inflter = (LayoutInflater.from(context));
		this.devices = devices;
	}
	@Override
	public int getCount() {
		return devices.size();
	}
	@Override
	public Object getItem(int i) {
		return devices.get(i);
	}
	@Override
	public long getItemId(int i) {
		return 0;
	}
	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		view = inflter.inflate(R.layout.device_list, null);
		TextView name = (TextView) view.findViewById(R.id.device_name);
		TextView state = (TextView) view.findViewById(R.id.device_state);
		name.setText(String.format("%s (%s)",devices.get(i).name,devices.get(i).id));
		state.setText(devices.get(i).state);
		return view;
	}
	private List<Device> devices;
	private LayoutInflater inflter;
}
