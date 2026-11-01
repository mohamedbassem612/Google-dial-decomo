package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vke implements defpackage.vja {
    public final ajct a;
    public final oko b;
    private final ajct c;
    private final vgj d;
    private final ahbv e;

    public vke(ahbv ahbvVar, vgj vgjVar, ajct ajctVar, ajcu ajcuVar, oko okoVar) {
        this.e = ahbvVar;
        this.a = ajctVar;
        this.c = ajcuVar;
        this.d = vgjVar;
        this.b = okoVar;
    }

    @Override // defpackage.vja
    public final ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ahbv ahbvVar = this.e;
        ajcq ajcqVarB = this.d.b(phoneAccountHandle);
        ajcq ajcqVarI = ahvr.I(ahbvVar.p(phoneAccountHandle), new defpackage.vge(phoneAccountHandle, 7), this.c);
        return ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarI}).o(new joq(this, ajcqVarB, ajcqVarI, phoneAccountHandle, 15, (byte[]) null), this.a);
    }

    @Override // defpackage.vja
    public final ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ajcq ajcqVarP = this.e.p(phoneAccountHandle);
        defpackage.vge vgeVar = new defpackage.vge(phoneAccountHandle, 6);
        ajct ajctVar = this.c;
        return ahvr.I(ahvr.I(ajcqVarP, vgeVar, ajctVar), new defpackage.vfv(this, phoneAccountHandle, 17), ajctVar);
    }
}
