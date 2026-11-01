package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahaq {
    public defpackage.ahap a;
    private akzc b;
    private boolean c;
    private byte d;

    public final defpackage.ahar a() {
        akzc akzcVar;
        defpackage.ahap ahapVar;
        if (this.d == 1 && (akzcVar = this.b) != null && (ahapVar = this.a) != null) {
            return new defpackage.ahar(akzcVar, ahapVar, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" data");
        }
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.d == 0) {
            sb.append(" containsPii");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final void c(akzc akzcVar) {
        if (akzcVar == null) {
            throw new java.lang.NullPointerException("Null data");
        }
        this.b = akzcVar;
    }
}
