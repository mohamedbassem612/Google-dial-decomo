package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xxa extends java.lang.Exception {
    private static final java.lang.StackTraceElement[] a = new java.lang.StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final java.util.List b;
    private defpackage.xuo c;
    private defpackage.xuc d;
    private java.lang.Class e;
    private java.lang.String f;

    public xxa(java.lang.String str, java.util.List list) {
        this.f = str;
        setStackTrace(a);
        this.b = list;
    }

    private final void c(java.lang.Throwable th, java.util.List list) {
        if (th instanceof defpackage.xxa) {
            java.util.Iterator it = ((defpackage.xxa) th).b.iterator();
            while (it.hasNext()) {
                c((java.lang.Throwable) it.next(), list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    private static void d(java.lang.Throwable th, java.lang.Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException(th);
        }
    }

    private final void e(java.lang.Appendable appendable) {
        d(this, appendable);
        defpackage.xwz xwzVar = new defpackage.xwz(appendable);
        java.util.List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                xwzVar.append("Cause (");
                int i2 = i + 1;
                xwzVar.append(java.lang.String.valueOf(i2));
                xwzVar.append(" of ");
                xwzVar.append(java.lang.String.valueOf(size));
                xwzVar.append("): ");
                java.lang.Throwable th = (java.lang.Throwable) list.get(i);
                if (th instanceof defpackage.xxa) {
                    ((defpackage.xxa) th).e(xwzVar);
                } else {
                    d(th, xwzVar);
                }
                i = i2;
            }
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    final void b(defpackage.xuo xuoVar, defpackage.xuc xucVar, java.lang.Class cls) {
        this.c = xuoVar;
        this.d = xucVar;
        this.e = cls;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(71);
        sb.append(this.f);
        java.lang.Class cls = this.e;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        defpackage.xuc xucVar = this.d;
        sb.append(xucVar != null ? ", ".concat(xucVar.toString()) : "");
        defpackage.xuo xuoVar = this.c;
        sb.append(xuoVar != null ? ", ".concat(xuoVar.toString()) : "");
        java.util.List<java.lang.Throwable> listA = a();
        if (listA.isEmpty()) {
            return sb.toString();
        }
        if (listA.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listA.size());
            sb.append(" root causes:");
        }
        for (java.lang.Throwable th : listA) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(java.lang.System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintWriter printWriter) {
        e(printWriter);
    }

    public xxa(java.lang.String str, java.lang.Throwable th) {
        this(str, java.util.Collections.singletonList(th));
    }

    public xxa(java.lang.String str) {
        this(str, java.util.Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
