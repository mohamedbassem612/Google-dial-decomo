package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jgq {
    public final aozh a;
    public java.lang.String b;
    public boolean c;
    private final android.content.Context d;
    private final java.lang.StringBuilder e;
    private java.lang.String f;
    private final zpz g;
    private final aozj h;

    public jgq(android.content.Context context, zpz zpzVar) {
        aooh.f(context, "appContext");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        this.d = context;
        this.g = zpzVar;
        aozj aozjVarA = aozk.a(aokc.a);
        this.h = aozjVarA;
        this.a = new aoys(aozjVarA, (aoub) null);
        this.e = new java.lang.StringBuilder();
        this.f = "";
    }

    public final void a() {
        abok abohVar;
        abok abohVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = this.b;
        if (str != null) {
            boolean z = this.c;
            android.content.Context context = this.d;
            if (z) {
                java.lang.String string = context.getString(2132017519);
                aooh.e(string, "getString(...)");
                abohVar2 = new defpackage.abog(string);
            } else {
                java.lang.String string2 = context.getString(2132017520);
                aooh.e(string2, "getString(...)");
                abohVar2 = new defpackage.aboh(string2);
            }
            arrayList.add(new defpackage.abof("disclaimer", null, str, null, 2, abohVar2, null, 74));
        }
        java.lang.String string3 = aoov.x(((java.lang.CharSequence) this.e) + this.f).toString();
        if (string3.length() > 0) {
            int length = this.f.length();
            android.content.Context context2 = this.d;
            if (length > 0) {
                java.lang.String string4 = context2.getString(2132017508);
                aooh.e(string4, "getString(...)");
                abohVar = new defpackage.abog(string4);
            } else {
                java.lang.String string5 = context2.getString(2132017509);
                aooh.e(string5, "getString(...)");
                abohVar = new defpackage.aboh(string5);
            }
            arrayList.add(new defpackage.abof("caller", null, string3, null, 1, abohVar, null, 74));
        }
        this.h.e(arrayList);
        this.g.a(ajcm.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    public final void b(twj twjVar, boolean z) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String strQ;
        aooh.f(twjVar, "transcription");
        amle amleVar = twjVar.b == 2 ? (amle) twjVar.c : amle.a;
        aooh.e(amleVar, "getSodaEvent(...)");
        amld amldVar = amleVar.c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        aooh.e(amldVar, "getRecognitionEvent(...)");
        if (z) {
            int i = amldVar.b;
            if (i != 1) {
                str = null;
            } else {
                if ((i == 1 ? (amkw) amldVar.c : amkw.a).c.size() > 0) {
                    str = (java.lang.String) (amldVar.b == 1 ? (amkw) amldVar.c : amkw.a).c.get(0);
                } else {
                    str = null;
                }
            }
        } else {
            int i2 = amldVar.b;
            if (i2 != 2) {
                str = null;
            } else {
                if ((i2 == 2 ? (amla) amldVar.c : amla.a).b.size() > 0) {
                    str = (java.lang.String) (amldVar.b == 2 ? (amla) amldVar.c : amla.a).b.get(0);
                } else {
                    str = null;
                }
            }
        }
        if (str == null || (string = aoov.x(str).toString()) == null || (strQ = aoov.Q(string, "</S>", "")) == null) {
            return;
        }
        java.lang.String str2 = true != aoov.H(strQ) ? strQ : null;
        if (str2 != null) {
            if (z) {
                java.lang.StringBuilder sb = this.e;
                sb.append(str2);
                sb.append(' ');
                this.f = "";
            } else {
                this.f = str2;
            }
            a();
        }
    }
}
