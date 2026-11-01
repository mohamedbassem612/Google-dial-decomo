package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qt extends defpackage.rm {
    public final int a;
    final android.os.Bundle b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    final android.os.Bundle i;
    public final int j;
    public final int k;
    final android.os.Bundle l;
    public final defpackage.qe m;
    public final java.lang.String n;
    public final java.util.List o;
    public final java.lang.String p;
    public final java.util.List q;
    public final int r;
    public final java.util.List s;
    public final java.util.List t;
    public final java.util.List u;
    public final boolean v;
    public final int w;
    private final java.util.List x;
    private final java.util.List y;
    private final java.util.List z;

    public qt(int i, java.util.List list, java.util.List list2, android.os.Bundle bundle, java.util.List list3, int i2, int i3, int i4, int i5, android.os.Bundle bundle2, int i6, int i7, android.os.Bundle bundle3, defpackage.qe qeVar, java.lang.String str, java.util.List list4, java.util.List list5, int i8, java.util.List list6, java.util.List list7, java.util.List list8, int i9) {
        this.a = i;
        dzk.x(list);
        this.x = j$.util.DesugarCollections.unmodifiableList(list);
        dzk.x(list2);
        this.y = j$.util.DesugarCollections.unmodifiableList(list2);
        dzk.x(bundle);
        this.b = bundle;
        dzk.x(list3);
        this.z = j$.util.DesugarCollections.unmodifiableList(list3);
        this.c = i2;
        this.d = 0;
        this.e = 0;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        dzk.x(bundle2);
        this.i = bundle2;
        this.j = i6;
        this.k = i7;
        dzk.x(bundle3);
        this.l = bundle3;
        this.m = qeVar;
        dzk.x(str);
        this.n = str;
        this.o = j$.util.DesugarCollections.unmodifiableList(list4);
        this.p = null;
        if (list5 != null) {
            this.q = j$.util.DesugarCollections.unmodifiableList(list5);
        } else {
            this.q = java.util.Collections.EMPTY_LIST;
        }
        this.r = i8;
        if (list6 != null) {
            this.s = j$.util.DesugarCollections.unmodifiableList(list6);
        } else {
            this.s = java.util.Collections.EMPTY_LIST;
        }
        this.t = list7 != null ? j$.util.DesugarCollections.unmodifiableList(list7) : java.util.Collections.EMPTY_LIST;
        this.u = list8 != null ? j$.util.DesugarCollections.unmodifiableList(list8) : java.util.Collections.EMPTY_LIST;
        this.v = false;
        this.w = i9;
    }

    public final java.util.List a() {
        java.util.List list = this.y;
        return list == null ? java.util.Collections.EMPTY_LIST : list;
    }

    public final java.util.List b() {
        java.util.List list = this.z;
        return list == null ? java.util.Collections.EMPTY_LIST : list;
    }

    public final java.util.List c() {
        java.util.List list = this.x;
        return list == null ? java.util.Collections.EMPTY_LIST : list;
    }

    public final java.util.Map d() {
        android.os.Bundle bundle = this.b;
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        aca acaVar = new aca(setKeySet.size());
        for (java.lang.String str : setKeySet) {
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(str);
            dzk.x(stringArrayList);
            acaVar.put(str, stringArrayList);
        }
        return acaVar;
    }

    public final java.util.Map e() {
        android.os.Bundle bundle = this.i;
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        aca acaVar = new aca(setKeySet.size());
        for (java.lang.String str : setKeySet) {
            acaVar.put(str, (java.util.List) j$.util.Objects.requireNonNull(bundle.getStringArrayList(str)));
        }
        return acaVar;
    }

    public final java.util.Map f() {
        android.os.Bundle bundle = this.l;
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        aca acaVar = new aca(setKeySet.size());
        for (java.lang.String str : setKeySet) {
            android.os.Bundle bundle2 = bundle.getBundle(str);
            if (bundle2 != null) {
                java.util.Set<java.lang.String> setKeySet2 = bundle2.keySet();
                aca acaVar2 = new aca(setKeySet2.size());
                for (java.lang.String str2 : setKeySet2) {
                    acaVar2.put(str2, java.lang.Double.valueOf(bundle2.getDouble(str2)));
                }
                acaVar.put(str, acaVar2);
            }
        }
        return acaVar;
    }

    public final boolean g() {
        return this.o.contains("LIST_FILTER_HAS_PROPERTY_FUNCTION");
    }

    public final boolean h() {
        return this.o.contains("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION");
    }

    public final boolean i() {
        return this.o.contains("LIST_FILTER_QUERY_LANGUAGE");
    }

    public final boolean j() {
        return this.o.contains("NUMERIC_SEARCH");
    }

    public final boolean k() {
        return this.o.contains("SCHEMA_SCORABLE_PROPERTY_CONFIG");
    }

    public final boolean l() {
        return this.o.contains("VERBATIM_SEARCH");
    }
}
