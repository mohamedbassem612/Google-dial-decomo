package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiy implements ajg {
    private final int a;
    private final int b;
    private final int c;
    private final ajh d;

    public aiy() {
        ajh ajhVar = ajk.a;
        this.a = 4;
        this.b = 300;
        this.c = 0;
        this.d = ajhVar;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.als a(nf nfVar) {
        acm acmVar = acn.a;
        acm acmVar2 = new acm(2);
        acmVar2.f(0);
        acmVar2.f(300);
        return new defpackage.aly(acmVar2, acp.a(), 300, this.d, 4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aiy)) {
            return false;
        }
        defpackage.aiy aiyVar = (defpackage.aiy) obj;
        int i = aiyVar.a;
        int i2 = aiyVar.b;
        int i3 = aiyVar.c;
        return aooh.n(this.d, aiyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + 407464;
    }
}
