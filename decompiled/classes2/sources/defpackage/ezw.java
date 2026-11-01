package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ezw {
    public final java.lang.String a;
    public int b;
    public long c;
    public defpackage.ffu d;
    public boolean e;
    public boolean f;
    final /* synthetic */ defpackage.ezx g;

    public ezw(defpackage.ezx ezxVar, java.lang.String str, int i, defpackage.ffu ffuVar) {
        j$.util.Objects.requireNonNull(ezxVar);
        this.g = ezxVar;
        this.a = str;
        this.b = i;
        this.c = ffuVar == null ? -1L : ffuVar.d;
        if (ffuVar == null || !ffuVar.c()) {
            return;
        }
        this.d = ffuVar;
    }

    public final boolean a(defpackage.ezm ezmVar) {
        defpackage.ffu ffuVar = ezmVar.d;
        if (ffuVar != null) {
            long j = this.c;
            if (j != -1) {
                long j2 = ffuVar.d;
                if (j2 > j) {
                    return true;
                }
                if (this.d != null) {
                    defpackage.erm ermVar = ezmVar.b;
                    int iA = ermVar.a(ffuVar.a);
                    int iA2 = ermVar.a(this.d.a);
                    defpackage.ffu ffuVar2 = this.d;
                    if (j2 >= ffuVar2.d && iA >= iA2) {
                        if (iA > iA2) {
                            return true;
                        }
                        if (ffuVar.c()) {
                            int i = ffuVar.b;
                            int i2 = ffuVar.c;
                            int i3 = ffuVar2.b;
                            if (i > i3) {
                                return true;
                            }
                            if (i == i3 && i2 > ffuVar2.c) {
                                return true;
                            }
                        } else {
                            int i4 = ffuVar.e;
                            if (i4 == -1 || i4 > ffuVar2.b) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (this.b != ezmVar.c) {
            return true;
        }
        return false;
    }
}
