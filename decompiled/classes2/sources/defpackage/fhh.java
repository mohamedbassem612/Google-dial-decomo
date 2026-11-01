package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fhh extends defpackage.era {
    public final aify c;

    public fhh(java.lang.String str, java.util.List list) {
        super(str, null, false, 1);
        this.c = aify.n(list);
    }

    @Override // defpackage.era, java.lang.Throwable
    public final java.lang.String getMessage() {
        aify aifyVar = this.c;
        java.lang.String message = super.getMessage();
        if (aifyVar.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + java.lang.String.valueOf(aifyVar);
    }
}
