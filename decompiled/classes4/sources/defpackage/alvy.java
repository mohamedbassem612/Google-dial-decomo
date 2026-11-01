package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvy {
    private final ajcu a;
    private java.lang.String b;
    private final java.text.BreakIterator d;
    private java.lang.String[] e;
    private j$.time.Duration f;
    private java.lang.Integer g;
    private java.util.function.Consumer h;
    private ajcs i;
    private java.lang.String c = "";
    private boolean j = false;

    public alvy(ajcu ajcuVar, java.util.Locale locale) {
        this.a = ajcuVar;
        this.d = java.text.BreakIterator.getWordInstance(locale);
    }

    public final synchronized void a(java.lang.String str, j$.time.Duration duration, java.util.function.Consumer consumer) {
        if (str.isEmpty() || duration.isNegative()) {
            return;
        }
        this.b = str;
        java.text.BreakIterator breakIterator = this.d;
        breakIterator.setText(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iFirst = breakIterator.first();
        while (true) {
            int i = iFirst;
            iFirst = breakIterator.next();
            if (iFirst == -1) {
                this.e = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                this.g = 0;
                this.f = duration.dividedBy(this.e.length);
                this.h = consumer;
                this.j = true;
                c();
                return;
            }
            arrayList.add(this.b.substring(i, iFirst));
        }
    }

    public final synchronized void b() {
        if (this.j) {
            this.i.cancel(false);
            this.j = false;
            if (this.c.length() < this.b.length()) {
                this.h.accept(java.lang.Integer.valueOf(this.b.length()));
            }
        }
    }

    public final synchronized void c() {
        if (this.j) {
            java.lang.String strSubstring = this.b.substring(0, this.g.intValue());
            this.h.accept(java.lang.Integer.valueOf(strSubstring.length()));
            this.c = strSubstring;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.d.following(this.g.intValue()));
            this.g = numValueOf;
            if (numValueOf.intValue() != -1) {
                this.i = this.a.b(new defpackage.alvr(this, 2), this.f.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }
}
