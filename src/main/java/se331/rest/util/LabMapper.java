package se331.rest.util;

import org.mapstruct.factory.Mappers;
import se331.rest.entity.Event;
import se331.rest.entity.EventDTO;
import se331.rest.entity.Organizer;
import se331.rest.proper.OrganizerDTO;

import java.util.List;

public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    EventDTO getEventDto(Event event);
    List<EventDTO> getEventDto(List<Event> events);
    OrganizerDTO getOrganizerDTO(Organizer organizer);
    List<OrganizerDTO> getOrganizerDTO(List<Organizer> organizers);
}
