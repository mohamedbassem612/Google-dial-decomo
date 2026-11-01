package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ahzc extends ahwu {
    final /* synthetic */ uzx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzc(ahzf ahzfVar, java.lang.CharSequence charSequence, uzx uzxVar) {
        super(ahzfVar, charSequence);
        this.g = uzxVar;
    }

    public final int a(int i) {
        return ((java.util.regex.Matcher) this.g.a).end();
    }

    public final int b(int i) {
        java.util.regex.Matcher matcher = (java.util.regex.Matcher) this.g.a;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }
}
