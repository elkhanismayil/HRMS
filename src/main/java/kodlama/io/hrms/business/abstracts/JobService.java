package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {

    Job add(Job job);

    DataResult<List<Job>> getAll();

    Job findByName(String name);

    Job findById(int id);
}
