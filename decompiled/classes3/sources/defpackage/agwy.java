package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agwy extends java.lang.RuntimeException {
    public agwy(java.lang.String str) {
        super("A state change that was assumed to be impossible has occurred in a read flow. Please report any occurrence of this exception with the complete stack trace and any test that reproduces the condition at go/tiktok-bug. Constraint broken: ".concat(str));
    }
}
