package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rye implements defpackage.agyz {
    final /* synthetic */ defpackage.ryf a;
    final /* synthetic */ java.lang.String b;

    public rye(defpackage.ryf ryfVar, java.lang.String str) {
        this.a = ryfVar;
        this.b = str;
    }

    @Override // defpackage.agyz
    public final /* synthetic */ agxk a() {
        return new agxj("calling_card_sharing_data_source");
    }

    @Override // defpackage.agyz
    public final ajcq b() {
        defpackage.ryf ryfVar = this.a;
        return aosv.F(ryfVar.e, 0, new defpackage.ryd(ryfVar, this.b, (aoln) null, 0), 3);
    }
}
