package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amts implements alah {
    EXPRESSO_NOT_SET(0),
    EXPRESSO_URGENT_CLICKED(1),
    EXPRESSO_QUESTION_CLICKED(2),
    EXPRESSO_CATCH_UP_CLICKED(3),
    EXPRESSO_NEWS_CLICKED(4);

    public final int f;

    amts(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
