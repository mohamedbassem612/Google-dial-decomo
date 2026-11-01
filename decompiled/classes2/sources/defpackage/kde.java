package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kde {
    private j$.util.Optional a;
    private tcp b;
    private aigf c;
    private j$.util.Optional d;
    private boolean e;
    private byte f;

    public kde(defpackage.kdf kdfVar) {
        this.a = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
        this.a = kdfVar.a;
        this.b = kdfVar.b;
        this.c = kdfVar.c;
        this.d = kdfVar.d;
        this.e = kdfVar.e;
        this.f = (byte) 1;
    }

    public final defpackage.kdf a() {
        tcp tcpVar;
        aigf aigfVar;
        if (this.f == 1 && (tcpVar = this.b) != null && (aigfVar = this.c) != null) {
            return new defpackage.kdf(this.a, tcpVar, aigfVar, this.d, this.e);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" rttConfiguration");
        }
        if (this.c == null) {
            sb.append(" wifiCallingIconsConfigForEachRowId");
        }
        if (this.f == 0) {
            sb.append(" initialLoad");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null filterState");
        }
        this.d = optional;
    }

    public final void c(boolean z) {
        this.e = z;
        this.f = (byte) 1;
    }

    public final void d(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null optionalCallLogUiModelRows");
        }
        this.a = optional;
    }

    public final void e(tcp tcpVar) {
        if (tcpVar == null) {
            throw new java.lang.NullPointerException("Null rttConfiguration");
        }
        this.b = tcpVar;
    }

    public final void f(aigf aigfVar) {
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null wifiCallingIconsConfigForEachRowId");
        }
        this.c = aigfVar;
    }

    public kde() {
        this.a = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
    }
}
