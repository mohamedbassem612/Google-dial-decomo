package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zjv {
    private static final defpackage.aimz c = defpackage.aimz.i("com/google/android/dialershared/externals/logging/SingletonScopedExternalsLogging");
    public final defpackage.mgw a;
    public final defpackage.ajcu b;
    private final defpackage.ainp d;
    private final defpackage.zth e;

    public zjv(defpackage.mgw mgwVar, defpackage.zth zthVar, defpackage.ajcu ajcuVar, defpackage.ainp ainpVar) {
        this.a = mgwVar;
        this.e = zthVar;
        this.b = ajcuVar;
        this.d = ainpVar;
    }

    public static /* synthetic */ void g(defpackage.zjv zjvVar, java.lang.Class cls, android.content.Intent intent, java.util.List list, int i) {
        if ((i & 4) != 0) {
            list = defpackage.aokc.a;
        }
        zjvVar.c(cls, intent, list, defpackage.aokc.a);
    }

    public static /* synthetic */ void i(defpackage.zjv zjvVar, defpackage.mgv mgvVar, java.util.List list, defpackage.mhc mhcVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            list = defpackage.aokc.a;
        }
        if ((i2 & 4) != 0) {
            mhcVar = defpackage.mhc.a;
            defpackage.aooh.e(mhcVar, "getDefaultInstance(...)");
        }
        if ((i2 & 16) != 0) {
            i = 2;
        }
        zjvVar.h(mgvVar, list, mhcVar, i);
    }

    public final defpackage.zjv a(defpackage.ainp ainpVar) {
        defpackage.aooh.f(ainpVar, "metadataKey");
        return this.e.c(ainpVar);
    }

    public final void b(java.lang.Class cls, android.content.Intent intent, java.util.List list) {
        defpackage.aooh.f(cls, "clazz");
        defpackage.aooh.f(intent, "intent");
        g(this, cls, intent, list, 8);
    }

    public final void c(java.lang.Class cls, android.content.Intent intent, java.util.List list, java.util.List list2) {
        defpackage.aooh.f(cls, "clazz");
        defpackage.aooh.f(intent, "intent");
        defpackage.aooh.f(list, "extraKeys");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (true) {
            java.lang.Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            android.os.Bundle extras = intent.getExtras();
            if (extras != null) {
                obj = extras.get(str);
            }
            arrayList.add(defpackage.gus.aw(java.lang.String.valueOf(obj)));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list2, 10));
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            java.lang.String str2 = (java.lang.String) it2.next();
            android.os.Bundle extras2 = intent.getExtras();
            arrayList2.add(defpackage.gus.aw(defpackage.aais.aD(extras2 != null ? extras2.get(str2) : null)));
        }
        d(cls, intent, defpackage.ajsz.bT(arrayList, arrayList2));
    }

    public final void d(java.lang.Class cls, android.content.Intent intent, java.util.List list) {
        defpackage.aooh.f(cls, "clazz");
        defpackage.aooh.f(intent, "intent");
        defpackage.aooh.f(list, "extraValues");
        defpackage.mgv mgvVar = defpackage.mgv.BROADCAST_RECEIVER_INTENT_EXTRAS;
        defpackage.mhc[] mhcVarArr = new defpackage.mhc[3];
        mhcVarArr[0] = defpackage.gus.aw(cls.getName());
        java.lang.String action = intent.getAction();
        if (action == null) {
            action = "null";
        }
        mhcVarArr[1] = defpackage.gus.aw(action);
        mhcVarArr[2] = defpackage.gus.ay(list);
        i(this, mgvVar, defpackage.ajsz.bb(mhcVarArr), null, 0, 28);
    }

    public final void e(defpackage.mgv mgvVar, java.util.List list, long j) {
        if (list == null) {
            defpackage.aooh.i("parameters");
        }
        defpackage.mhc mhcVar = defpackage.mhc.a;
        defpackage.aooh.e(mhcVar, "getDefaultInstance(...)");
        i(this, mgvVar, list, mhcVar, 0, 16);
    }

    public final void f(defpackage.mgv mgvVar, java.util.List list, defpackage.mhc mhcVar) {
        defpackage.aooh.f(list, "parameters");
        defpackage.aooh.f(mhcVar, "returnValue");
        i(this, mgvVar, list, mhcVar, 0, 24);
    }

    public final void h(defpackage.mgv mgvVar, java.util.List list, defpackage.mhc mhcVar, int i) {
        if (list == null) {
            defpackage.aooh.i("parameters");
        }
        if (mhcVar == null) {
            defpackage.aooh.i("returnValue");
        }
        if (i == 0) {
            defpackage.aooh.i("eventType");
        }
        defpackage.ainp ainpVar = this.d;
        defpackage.aimz aimzVar = c;
        if (ainpVar != null) {
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aimzVar.b()).i(ainpVar).l("com/google/android/dialershared/externals/logging/SingletonScopedExternalsLogging", "recordCallMethodInvocation", 66, "SingletonScopedExternalsLogging.kt");
            java.lang.String strName = mgvVar.name();
            defpackage.mhc mhcVarAy = defpackage.gus.ay(list);
            defpackage.aokd aokdVar = defpackage.aokd.a;
            aimwVar.M("event: %s, function parameters: %s, return value: %s", strName, defpackage.gus.aA(mhcVarAy, aokdVar), defpackage.gus.aA(mhcVar, aokdVar));
        } else {
            defpackage.aimw aimwVar2 = (defpackage.aimw) aimzVar.b().l("com/google/android/dialershared/externals/logging/SingletonScopedExternalsLogging", "recordCallMethodInvocation", 75, "SingletonScopedExternalsLogging.kt");
            java.lang.String strName2 = mgvVar.name();
            defpackage.mhc mhcVarAy2 = defpackage.gus.ay(list);
            defpackage.aokd aokdVar2 = defpackage.aokd.a;
            aimwVar2.M("event: %s, function parameters: %s, return value: %s", strName2, defpackage.gus.aA(mhcVarAy2, aokdVar2), defpackage.gus.aA(mhcVar, aokdVar2));
        }
        this.a.a();
    }
}
