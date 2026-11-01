package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class eal {
    android.graphics.Rect[][] b;
    android.graphics.Rect[][] c;

    public eal(defpackage.eax eaxVar) {
        this.b = new android.graphics.Rect[10][];
        this.c = new android.graphics.Rect[10][];
        e(eaxVar);
    }

    public defpackage.eax a() {
        throw null;
    }

    public void d(int i, defpackage.dwn dwnVar) {
        throw null;
    }

    public void e(defpackage.eax eaxVar) {
        int i = 1;
        while (i <= 512) {
            defpackage.eau eauVar = eaxVar.b;
            java.util.List listF = eauVar.f(i);
            int iG = defpackage.dzo.g(i);
            this.b[iG] = (android.graphics.Rect[]) listF.toArray(new android.graphics.Rect[listF.size()]);
            if (i != 8) {
                java.util.List listG = eauVar.g(i);
                this.c[iG] = (android.graphics.Rect[]) listG.toArray(new android.graphics.Rect[listG.size()]);
            } else {
                i = 8;
            }
            i <<= 1;
        }
    }

    public eal() {
        this(new defpackage.eax((defpackage.eax) null));
    }

    public void b(defpackage.dwn dwnVar) {
    }

    public void c(defpackage.dwn dwnVar) {
    }
}
