package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdx implements ajas {
    public final /* synthetic */ vea a;
    public final /* synthetic */ android.telecom.PhoneAccountHandle b;
    public final /* synthetic */ defpackage.vce c;
    public final /* synthetic */ int d;
    public final /* synthetic */ defpackage.amsi e;
    public final /* synthetic */ int f;

    public /* synthetic */ vdx(vea veaVar, android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vce vceVar, int i, int i2, defpackage.amsi amsiVar) {
        this.a = veaVar;
        this.b = phoneAccountHandle;
        this.c = vceVar;
        this.d = i;
        this.f = i2;
        this.e = amsiVar;
    }

    public final ajcq a() {
        vea veaVar = this.a;
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.b;
        return ahvr.H(veaVar.k(phoneAccountHandle, this.c, this.d, this.f, this.e), new defpackage.van(phoneAccountHandle, 15), veaVar.d);
    }
}
