package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gzc {
    public static final java.lang.String a = gsh.b("DiagnosticsWrkr");

    public static final java.lang.String a(gxe gxeVar, gxx gxxVar, gwz gwzVar, java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            gxl gxlVar = (gxl) it.next();
            gwy gwyVarA = gwzVar.a(gus.u(gxlVar));
            java.lang.Integer numValueOf = gwyVarA != null ? java.lang.Integer.valueOf(gwyVarA.c) : null;
            java.lang.String str = gxlVar.b;
            java.lang.String strCr = ajsz.cr(gxeVar.a(str), ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62);
            java.lang.String strCr2 = ajsz.cr(gxxVar.a(str), ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62);
            sb.append("\n" + str + "\t " + gxlVar.d + "\t " + numValueOf + "\t " + gxlVar.c.name() + "\t " + strCr + "\t " + strCr2 + '\t');
        }
        return sb.toString();
    }
}
