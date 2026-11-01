package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dnz {
    public static final defpackage.dny a = new defpackage.dny();

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    public static final boolean a(defpackage.dks dksVar) {
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        if ((dksVar.b & 1095216660480L) == 0 && dksVar.f == null && dksVar.c == null && dksVar.d == null && dksVar.e == null && dksVar.g == null) {
            defpackage.dok dokVar = dksVar.i;
            if (dokVar != null) {
                float f = dokVar.a;
                if (java.lang.Math.abs(f) > Float.MAX_VALUE || f == 0.0f) {
                    if ((dksVar.h & 1095216660480L) != 0 && dksVar.j == null && dksVar.k == null) {
                        return false;
                    }
                }
            } else if ((dksVar.h & 1095216660480L) != 0) {
            }
        }
        return true;
    }

    public static final boolean b(defpackage.dkz dkzVar) {
        defpackage.dki dkiVar = dkzVar.d;
        if (dkiVar != null) {
            return dkiVar.b.a;
        }
        return false;
    }
}
