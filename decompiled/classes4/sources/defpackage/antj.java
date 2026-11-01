package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antj extends defpackage.antk {
    public anph a;
    public anqw b;
    public anph c;

    @Override // defpackage.antk
    protected final int a(android.os.Parcel parcel) {
        defpackage.antb.b(parcel, this.a);
        return 0;
    }

    @Override // defpackage.antk
    protected final int b(android.os.Parcel parcel) {
        int iM = anty.m(parcel, this.b);
        defpackage.antb.b(parcel, this.c);
        this.d.y(this.e);
        return iM;
    }
}
