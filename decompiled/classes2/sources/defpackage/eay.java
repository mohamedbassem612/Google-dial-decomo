package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class eay extends defpackage.eav {
    final android.view.WindowInsetsController a;
    protected final android.view.Window b;

    public eay(android.view.Window window) {
        android.view.WindowInsetsController windowInsetsControllerM = baa$.ExternalSyntheticApiModelOutline1.m(window.getDecorView());
        new aec(0);
        this.a = windowInsetsControllerM;
        this.b = window;
    }

    private final void l(boolean z, int i, int i2) {
        if (this.b != null) {
            if (z) {
                j(i);
                return;
            } else {
                k(i);
                return;
            }
        }
        android.view.WindowInsetsController windowInsetsController = this.a;
        if (z) {
            baa$.ExternalSyntheticApiModelOutline1.m(windowInsetsController, i2, i2);
        } else {
            baa$.ExternalSyntheticApiModelOutline1.m(windowInsetsController, 0, i2);
        }
    }

    @Override // defpackage.eav
    public final void b(int i) {
        baa$.ExternalSyntheticApiModelOutline1.m$1(this.a, i & (-9));
    }

    @Override // defpackage.eav
    public void c(boolean z) {
        l(z, 16, 16);
    }

    @Override // defpackage.eav
    public void d(boolean z) {
        l(z, 8192, 8);
    }

    @Override // defpackage.eav
    public void e(int i) {
        android.view.Window window = this.b;
        if (window == null) {
            baa$.ExternalSyntheticApiModelOutline1.m$2(this.a, i);
            return;
        }
        window.getDecorView().setTag(356039078, java.lang.Integer.valueOf(i));
        if (i != 1) {
            k(2048);
            j(4096);
        } else {
            k(4096);
            j(2048);
        }
    }

    @Override // defpackage.eav
    public final void f(int i) {
        baa$.ExternalSyntheticApiModelOutline1.m(this.a, i & (-9));
    }

    @Override // defpackage.eav
    public boolean g() {
        android.view.Window window = this.b;
        if (window == null) {
            android.view.WindowInsetsController windowInsetsController = this.a;
            baa$.ExternalSyntheticApiModelOutline1.m(windowInsetsController, 0, 0);
            if ((baa$.ExternalSyntheticApiModelOutline1.m(windowInsetsController) & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    protected final void j(int i) {
        android.view.View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    protected final void k(int i) {
        android.view.View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }
}
