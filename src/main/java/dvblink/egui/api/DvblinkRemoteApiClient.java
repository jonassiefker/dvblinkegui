package dvblink.egui.api;

import dvblink.egui.api.model.Channel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by siefker on 13.02.2017.
 */
@FeignClient (name = "dvblinkEgui", url = "127.0.0.1:8190/cs")
public interface DvblinkRemoteApiClient {
    @RequestMapping(method = RequestMethod.GET, value = "command=get_channels&xml_param={params}")
    List<Channel> getAllChannels(@PathVariable("params") String params);
}
