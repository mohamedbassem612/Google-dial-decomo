package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aedg extends java.lang.Exception {
    public aedg() {
        super("Failed to access GNP API");
    }

    public aedg(java.lang.Throwable th) {
        super("Failed to parse the response returned from GNP API", th);
    }
}
