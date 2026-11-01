package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class omi implements defpackage.olu {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("Code: \\(([A-Z]+)\\)");
    private final ajct b;
    private final afpl c;

    public omi(afpl afplVar, ajct ajctVar) {
        this.c = afplVar;
        this.b = ajctVar;
    }

    @Override // defpackage.olu
    public final ajcq a() {
        ahrv ahrvVarG = ahrv.g(this.c.X());
        defpackage.ibe ibeVar = new defpackage.ibe(15);
        ajct ajctVar = this.b;
        return ahrvVarG.i(ibeVar, ajctVar).h(new lix(20), ajctVar);
    }
}
