package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class ene {
    final defpackage.enh c;
    boolean d;
    int e = -1;
    final /* synthetic */ defpackage.enf f;

    public ene(defpackage.enf enfVar, defpackage.enh enhVar) {
        this.f = enfVar;
        this.c = enhVar;
    }

    public boolean c(defpackage.emx emxVar) {
        return false;
    }

    final void d(boolean z) {
        boolean z2;
        if (z != this.d) {
            this.d = z;
            defpackage.enf enfVar = this.f;
            int i = true != z ? -1 : 1;
            int i2 = enfVar.c;
            enfVar.c = i + i2;
            if (!enfVar.d) {
                enfVar.d = true;
                while (true) {
                    try {
                        int i3 = enfVar.c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            i2 = 0;
                            z2 = i3 > 0;
                        } else {
                            z2 = false;
                        }
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            enfVar.a();
                        } else if (z3) {
                            enfVar.b();
                        }
                        i2 = i3;
                    } catch (java.lang.Throwable th) {
                        enfVar.d = false;
                        throw th;
                    }
                }
                enfVar.d = false;
            }
            if (this.d) {
                this.f.f(this);
            }
        }
    }

    public abstract boolean dD();

    public void b() {
    }
}
