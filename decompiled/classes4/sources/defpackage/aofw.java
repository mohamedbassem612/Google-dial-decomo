package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aofw {
    static {
        java.util.logging.Logger.getLogger(defpackage.aofw.class.getName());
    }

    private aofw() {
    }

    public static byte[][] a(java.util.List list) {
        byte[][] bArr = new byte[list.size() << 1][];
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            defpackage.aogn aognVar = (defpackage.aogn) it.next();
            bArr[i] = aognVar.f.o();
            bArr[i + 1] = aognVar.g.o();
            i += 2;
        }
        return defpackage.aodp.b(bArr);
    }
}
