package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agep extends defpackage.ageu {
    final /* synthetic */ defpackage.ager a;
    final /* synthetic */ zzx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agep(defpackage.ager agerVar, zzx zzxVar, zzx zzxVar2) {
        super(zzxVar);
        this.b = zzxVar2;
        j$.util.Objects.requireNonNull(agerVar);
        this.a = agerVar;
    }

    @Override // defpackage.ageu
    protected final void a() {
        try {
            defpackage.ager agerVar = this.a;
            ylb ylbVar = agerVar.a.l;
            java.lang.String str = agerVar.b;
            int i = defpackage.ages.a;
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Map mapA = defpackage.ages.a();
            bundle.putInt("playcore_version_code", ((java.lang.Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((java.lang.Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((java.lang.Integer) mapA.get("unity")).intValue());
            }
            defpackage.ageq ageqVar = new defpackage.ageq(agerVar, this.b);
            android.os.Parcel parcelEP = ylbVar.eP();
            parcelEP.writeString(str);
            yld.d(parcelEP, bundle);
            yld.f(parcelEP, ageqVar);
            ylbVar.eS(2, parcelEP);
        } catch (android.os.RemoteException e) {
            defpackage.ager.c.D(e, "error requesting in-app review for %s", new java.lang.Object[]{this.a.b});
            this.b.h(new java.lang.RuntimeException(e));
        }
    }
}
