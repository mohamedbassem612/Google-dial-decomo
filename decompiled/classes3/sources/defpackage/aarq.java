package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aarq {
    public java.lang.Long a;
    public java.lang.String b;
    public com.google.android.gms.people.cpg.callingcard.v2.AccountInfo c;
    private int d;
    private byte e;

    public final com.google.android.gms.people.cpg.callingcard.v2.Identifier a() {
        if (this.e == 1) {
            return new com.google.android.gms.people.cpg.callingcard.v2.Identifier(this.d, this.a, this.b, this.c);
        }
        throw new java.lang.IllegalStateException("Missing required properties: identifierType");
    }

    public final void b(int i) {
        this.d = i;
        this.e = (byte) 1;
    }
}
