package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vjy implements defpackage.viy {
    public final ajct a;
    public final vpq b;
    private final vgu c;

    public vjy(ajct ajctVar, vgu vguVar, vpq vpqVar) {
        this.a = ajctVar;
        this.c = vguVar;
        this.b = vpqVar;
    }

    @Override // defpackage.viy
    public final ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ahru ahruVarA = this.c.a(phoneAccountHandle);
        defpackage.vjw vjwVar = new defpackage.vjw(1);
        ajct ajctVar = this.a;
        return ahruVarA.d(vjwVar, ajctVar).e().h(new defpackage.vju(2), ajctVar);
    }

    @Override // defpackage.viy
    public final ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ahru ahruVarA = this.c.a(phoneAccountHandle);
        defpackage.vjw vjwVar = new defpackage.vjw(0);
        ajct ajctVar = this.a;
        return ahruVarA.d(vjwVar, ajctVar).e().i(new defpackage.vfv(this, phoneAccountHandle, 14), ajctVar).h(new defpackage.vju(4), ajctVar);
    }

    @Override // defpackage.viy
    public final ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vci vciVar) {
        ahru ahruVarA = this.c.a(phoneAccountHandle);
        defpackage.vgf vgfVar = new defpackage.vgf(this, vciVar, 3);
        ajct ajctVar = this.a;
        return ahruVarA.d(vgfVar, ajctVar).e().h(new defpackage.vju(3), ajctVar);
    }
}
