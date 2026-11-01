package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ahyj {
    public final java.lang.String c;

    public ahyj(java.lang.String str) {
        str.getClass();
        this.c = str;
    }

    public static defpackage.ahyj d(char c) {
        return new defpackage.ahyj(java.lang.String.valueOf(c));
    }

    public java.lang.CharSequence a(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        return obj instanceof java.lang.CharSequence ? (java.lang.CharSequence) obj : obj.toString();
    }

    public java.lang.String b(java.lang.Iterable iterable) {
        return e(iterable.iterator());
    }

    public void c(java.lang.Appendable appendable, java.util.Iterator it) throws java.io.IOException {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.c);
                appendable.append(a(it.next()));
            }
        }
    }

    public final java.lang.String e(java.util.Iterator it) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        g(sb, it);
        return sb.toString();
    }

    public final java.lang.String f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object... objArr) {
        return b(new defpackage.ahyi(objArr, obj, obj2));
    }

    public final void g(java.lang.StringBuilder sb, java.util.Iterator it) {
        try {
            c(sb, it);
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final void h(java.lang.StringBuilder sb, java.lang.Iterable iterable) {
        g(sb, iterable.iterator());
    }

    public ahyj(defpackage.ahyj ahyjVar) {
        this.c = ahyjVar.c;
    }
}
