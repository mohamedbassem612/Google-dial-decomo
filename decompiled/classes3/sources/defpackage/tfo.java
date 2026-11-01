package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfo {
    public static final java.util.List a;

    static {
        defpackage.tfe tfeVar = defpackage.tfe.a;
        a = ajsz.bb(new defpackage.tfe[]{tfeVar, tfeVar, tfeVar});
    }

    public static final defpackage.tfn a(defpackage.tfn tfnVar, int i) {
        aooh.f(tfnVar, "<this>");
        defpackage.tfk tfkVar = tfnVar.a;
        defpackage.tfj tfjVar = tfkVar.f;
        java.lang.String str = tfjVar.a;
        java.lang.String str2 = tfjVar.c;
        int i2 = tfjVar.e;
        int i3 = tfjVar.f;
        long j = tfjVar.d;
        aooh.f(str, "phoneNumber");
        aooh.f(str2, "query");
        defpackage.tfj tfjVar2 = new defpackage.tfj(str, i, str2, i2, i3, j);
        dji djiVar = tfkVar.a;
        dji djiVar2 = tfkVar.b;
        java.lang.String str3 = tfkVar.c;
        boolean z = tfkVar.d;
        defpackage.abvz abvzVar = tfkVar.e;
        java.lang.String str4 = tfkVar.g;
        android.net.Uri uri = tfkVar.h;
        int i4 = tfkVar.i;
        nwx nwxVar = tfkVar.j;
        boolean z2 = tfkVar.k;
        aooh.f(djiVar, "title");
        aooh.f(djiVar2, "subtitle");
        aooh.f(abvzVar, "calleeId");
        aooh.f(nwxVar, "meetReachability");
        return defpackage.tfn.a(tfnVar, new defpackage.tfk(djiVar, djiVar2, str3, z, abvzVar, tfjVar2, str4, uri, i4, nwxVar, z2), null, 2);
    }
}
