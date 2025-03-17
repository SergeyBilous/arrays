import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int tempForSave = 0;


    void clear() {

    }

    void save(Resume r) {
        if(storage.length > tempForSave){
            storage[tempForSave] = r;
            tempForSave++;
        }else {
            System.out.println("The Storage is full");
        }

    }

    Resume get(String uuid) {
        for (Resume resume : storage) {
            if (uuid.equals(resume.uuid)) {
                return resume;
            }
        }
        return null;
    }

    void delete(String uuid) {
        for(Resume numsForDelete : storage)
            if (numsForDelete.uuid == uuid) {
                uuid = null;
            }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        int countLength = 0;
        for (Resume nums1 : storage) {
            if (nums1 != null) {
                countLength++;
            }else {
                continue;
            }
        }
        return Arrays.copyOf(storage, countLength);
    }

    int size() {
        return storage.length;
    }
}
