package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqe implements defpackage.adnu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/audiomessages/AudioMessageFileManagerImpl");
    public final android.content.Context b;
    public final defpackage.adsg c;
    public defpackage.ajct d;
    public defpackage.adon e;
    public defpackage.aify f;
    public defpackage.adqj g;
    public defpackage.adqk h;
    public final defpackage.adqb i;
    public defpackage.aogc j;
    private final defpackage.adfr k = new defpackage.adfr("adqe", defpackage.ajbm.INSTANCE);

    public adqe(android.content.Context context, defpackage.adsg adsgVar, defpackage.adqb adqbVar) {
        this.b = context;
        this.c = adsgVar;
        this.i = adqbVar;
    }

    private final void g(java.lang.Iterable iterable) {
        j$.lang.Iterable.-EL.forEach(iterable, new defpackage.vzg(this, 4));
    }

    @Override // defpackage.adnu
    public final defpackage.aify a() {
        this.k.b();
        return (defpackage.aify) this.j.b;
    }

    @Override // defpackage.adnu
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        this.k.b();
        g(aihdVar);
        return this.d.submit(new defpackage.nyf(this, aihdVar, 14));
    }

    @Override // defpackage.adnu
    public final defpackage.ajcq c(java.util.concurrent.ExecutorService executorService, defpackage.adon adonVar) {
        return this.k.a(new defpackage.adqd(this, executorService, adonVar, 0));
    }

    @Override // defpackage.adnu
    public final defpackage.ajcq d(defpackage.aihd aihdVar) {
        this.k.b();
        g(aihdVar);
        defpackage.lkf lkfVar = new defpackage.lkf(this, aihdVar, 7);
        defpackage.ajct ajctVar = this.d;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(lkfVar);
        ajctVar.execute(ajdkVar);
        return ajdkVar;
    }

    public final defpackage.ajcq e(final defpackage.adnv adnvVar, final java.util.List list) {
        int i = 0;
        while (i < list.size()) {
            final int i2 = i + 1;
            final defpackage.adqq adqqVar = (defpackage.adqq) list.get(i);
            if (adqqVar.e(adnvVar)) {
                return defpackage.ajck.w(adqqVar.b(new defpackage.aile(adnvVar))).v(java.lang.Exception.class, new defpackage.ajat() { // from class: adqc
                    @Override // defpackage.ajat
                    public final defpackage.ajcq a(java.lang.Object obj) {
                        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.adqe.a.d()).k((java.lang.Exception) obj)).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioMessageFileManagerImpl", "prepareOne", 233, "AudioMessageFileManagerImpl.java");
                        java.lang.String simpleName = adqqVar.getClass().getSimpleName();
                        defpackage.adnv adnvVar2 = adnvVar;
                        aimwVar.I("Provider %s failed to prepare message %s, trying with next provider", simpleName, adnvVar2);
                        java.util.List list2 = list;
                        return this.a.e(adnvVar2, list2.subList(i2, list2.size()));
                    }
                }, this.d);
            }
            i = i2;
        }
        return new defpackage.ajdd(new defpackage.adnt("None of the providers were able to prepare message ".concat(java.lang.String.valueOf(java.lang.String.valueOf(adnvVar))), null, new defpackage.adnv[0]));
    }

    public final j$.util.Optional f(defpackage.adnv adnvVar) {
        return (j$.util.Optional) j$.util.Collection.-EL.stream(this.f).map(new defpackage.okq(adnvVar, 7)).filter(new defpackage.opv(10)).findFirst().orElse(j$.util.Optional.empty());
    }
}
