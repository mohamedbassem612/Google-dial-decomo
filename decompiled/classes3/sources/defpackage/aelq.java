package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aelq implements defpackage.acnm {
    final /* synthetic */ android.content.Context a;

    public aelq(android.content.Context context) {
        this.a = context;
    }

    @Override // defpackage.acnm
    public final /* synthetic */ ahyn a(aclv aclvVar) {
        return ahwt.a;
    }

    @Override // defpackage.acnm
    public final /* synthetic */ ahyn b(aclv aclvVar) {
        return ahwt.a;
    }

    @Override // defpackage.acnm
    public final ahyn c(aclv aclvVar) {
        return ahyn.h(new zzl(78315553, 6));
    }

    @Override // defpackage.acnm
    public final ajcq d(aclv aclvVar, ajcq ajcqVar) {
        akzx akzxVarM = defpackage.alfn.a.m();
        akzx akzxVarM2 = defpackage.alfm.a.m();
        java.lang.String packageName = this.a.getPackageName();
        akzxVarM2.u();
        defpackage.alfm alfmVar = (defpackage.alfm) akzxVarM2.b;
        j$.util.Objects.requireNonNull(packageName);
        alfmVar.b |= 64;
        alfmVar.g = packageName;
        akzxVarM.u();
        defpackage.alfn alfnVar = (defpackage.alfn) akzxVarM.b;
        defpackage.alfm alfmVar2 = (defpackage.alfm) akzxVarM2.p();
        j$.util.Objects.requireNonNull(alfmVar2);
        alfnVar.c = alfmVar2;
        alfnVar.b |= 1;
        return aiql.z(akzxVarM.p());
    }

    @Override // defpackage.acnm
    public final /* synthetic */ ajcq e(aclv aclvVar, ajcq ajcqVar) {
        return aiql.z((java.lang.Object) null);
    }

    @Override // defpackage.acnm
    public final java.lang.String f(aclv aclvVar) {
        return "ONEGOOGLE_MOBILE";
    }

    @Override // defpackage.acnm
    public final /* synthetic */ ajcq g() {
        throw null;
    }

    @Override // defpackage.acnm
    public final void h(aclv aclvVar) {
    }
}
