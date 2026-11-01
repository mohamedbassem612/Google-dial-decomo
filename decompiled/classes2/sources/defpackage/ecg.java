package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ecg implements dyn {
    final /* synthetic */ androidx.core.widget.NestedScrollView a;

    public ecg(androidx.core.widget.NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    public final float a() {
        return -this.a.a();
    }

    public final void b() {
        this.a.a.abortAnimation();
    }

    public final boolean c(float f) {
        if (f == 0.0f) {
            return false;
        }
        b();
        this.a.j((int) f);
        return true;
    }
}
