package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aezf {
    public static final /* synthetic */ int a = 0;
    private static final afhi b = new afhi(defpackage.aeyb.a);
    private static final java.lang.Object c = new java.lang.Object();
    private static volatile ahbz d = null;

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public static boolean a(java.io.File file) {
        java.io.File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            boolean z = true;
            for (java.io.File file2 : fileArrListFiles) {
                z = z && a(file2);
            }
            if (z) {
                if (file.delete()) {
                    return true;
                }
            }
        } else if (file.delete()) {
            return true;
        }
        return false;
    }

    public static afhf b(aewq aewqVar) {
        afgo afgoVarA = afgp.a();
        java.util.regex.Pattern pattern = afej.a;
        afei afeiVar = new afei(aewqVar.c);
        afeiVar.e("phenotype");
        afeiVar.f("all_accounts.pb");
        afgoVarA.e(afeiVar.a());
        afgoVarA.d(defpackage.aeyb.a);
        afgoVarA.a = ahyn.h(b);
        afgoVarA.c();
        afgp afgpVarA = afgoVarA.a();
        ahbz ahbzVar = d;
        if (ahbzVar == null) {
            synchronized (c) {
                ahbzVar = d;
                if (ahbzVar == null) {
                    afhj afhjVar = afhj.a;
                    java.util.HashMap map = new java.util.HashMap();
                    ajcu ajcuVarC = aewqVar.c();
                    aogc aogcVar = (aogc) aewqVar.e.eZ();
                    agab.ag(afha.a, map);
                    ahbz ahbzVar2 = new ahbz(ajcuVarC, aogcVar, afhjVar, map);
                    d = ahbzVar2;
                    ahbzVar = ahbzVar2;
                }
            }
        }
        return ahbzVar.k(afgpVarA);
    }
}
