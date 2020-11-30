import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmentkomunikasi.*

// mengembalikan fragment yang terkait dengan salah satu halaman
class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        // membuat fragment untuk halaman diberikan
        return if (position == 0) {
            FirstFrament.newInstance()
        } else if (position == 1) {
            SecondFragment.newInstance()
        } else if (position == 2) {
            ThirdFragment.newInstance()
        } else if (position == 3) {
            FourthFragment.newInstance()
        } else {
            FifthFragment.newInstance()
        }
    }
    override fun getPageTitle(position: Int): CharSequence? {
        // untuk menampilkan daftar pada bar yang akan ditampilkan
        return mContext.resources.getString(TAB_TITLES[position])
    }
    override fun getCount(): Int {
        // untuk memunculkan berapa bar yang akan ditampilkan
        return 5
    }
    companion object {
        @StringRes
        // inisialisasi berisi menampilkan data array untuk ditampilkan di bar
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4 ,R.string.tab_text_5)
    }
}