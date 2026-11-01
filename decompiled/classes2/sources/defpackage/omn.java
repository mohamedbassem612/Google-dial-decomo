package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class omn implements znt, defpackage.olu {
    private boolean a = false;

    @Override // defpackage.olu
    public final ajcq a() {
        otm otmVar = new otm((char[]) null);
        otmVar.a = "is_ringer_silenced";
        otmVar.f(java.lang.Boolean.toString(this.a));
        return aiql.z(otmVar.e());
    }

    public final ajcq b() {
        this.a = true;
        return ajcm.a;
    }
}
