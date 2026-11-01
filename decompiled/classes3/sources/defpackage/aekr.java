package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aekr {
    public ahyn a;
    public aesg b;
    public aesg c;
    private final ahyn d;
    private final ahyn e;
    private final ahyn f;
    private final ahyn g;
    private ahyn h;
    private boolean i;
    private byte j;

    public aekr() {
        ahwt ahwtVar = ahwt.a;
        this.d = ahwtVar;
        this.e = ahwtVar;
        this.f = ahwtVar;
        this.a = ahwtVar;
        this.g = ahwtVar;
        this.h = ahwtVar;
    }

    public final defpackage.aeks a() {
        aesg aesgVar;
        aesg aesgVar2;
        java.lang.Boolean.FALSE.booleanValue();
        if (this.j == 1 && (aesgVar = this.b) != null && (aesgVar2 = this.c) != null) {
            return new defpackage.aeks(this.d, this.e, this.f, this.a, this.g, this.h, aesgVar, this.i, aesgVar2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" secondaryButtonStyleFeature");
        }
        if (this.j == 0) {
            sb.append(" supportAccountSwitching");
        }
        if (this.c == null) {
            sb.append(" customContinueButtonTextsFactory");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(defpackage.aeku aekuVar) {
        this.h = ahyn.h(aekuVar);
    }

    public final void c(boolean z) {
        this.i = z;
        this.j = (byte) 1;
    }
}
