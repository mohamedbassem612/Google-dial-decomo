package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class amdz {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/ParsedOption");

    public abstract defpackage.altp a();

    public abstract defpackage.amdz b();

    public abstract akzx c();

    public final defpackage.amdz d(java.lang.String str, int i) {
        int i2 = a().a;
        defpackage.amft amftVarH = defpackage.amev.h((defpackage.amft) c().p(), str.substring(i2, i), defpackage.altp.b(i2, i));
        int i3 = amftVarH.c;
        if (i3 == 2) {
            amdx amdxVar = new amdx();
            amdxVar.d((defpackage.amgc) amftVarH.d);
            return amdxVar.c();
        }
        if (i3 == 8) {
            amdx amdxVar2 = new amdx();
            amdxVar2.b((defpackage.amgf) amftVarH.d);
            return amdxVar2.a();
        }
        if (i3 != 1) {
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/ParsedOption", "extend", 218, "ParsedOption.java").v("Unable to update item text - updated am item has no text.");
            return this;
        }
        amdx amdxVar3 = new amdx();
        amdxVar3.f((defpackage.amfp) amftVarH.d);
        return amdxVar3.e();
    }
}
