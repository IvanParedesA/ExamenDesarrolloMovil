
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin.moviles.data.network.model.NinjaBase
import com.example.kotlin.moviles.domain.NinjaListRequirement
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {

    val ninjaBaseLiveData = MutableLiveData<List<NinjaBase>>()
    private val ninjaListRequirement = NinjaListRequirement()

    fun getNinjaList(){
        viewModelScope.launch(Dispatchers.IO){

        }

    }
}
