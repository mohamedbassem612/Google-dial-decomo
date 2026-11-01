package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GoogleSignInOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable, aacu {
    public static final android.os.Parcelable.Creator CREATOR;
    public static final com.google.android.gms.common.api.Scope a;
    public static final com.google.android.gms.common.api.Scope b;
    public static final com.google.android.gms.common.api.Scope c;
    public static final com.google.android.gms.common.api.Scope d;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions e;
    public static final java.util.Comparator f;
    final int g;
    public final java.util.ArrayList h;
    public final android.accounts.Account i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final java.lang.String m;
    public final java.lang.String n;
    public final java.util.ArrayList o;
    public final java.lang.String p;

    static {
        com.google.android.gms.common.api.Scope scope = new com.google.android.gms.common.api.Scope(1, "profile");
        a = scope;
        new com.google.android.gms.common.api.Scope(1, "email");
        b = new com.google.android.gms.common.api.Scope(1, "openid");
        com.google.android.gms.common.api.Scope scope2 = new com.google.android.gms.common.api.Scope(1, "https://www.googleapis.com/auth/games_lite");
        c = scope2;
        d = new com.google.android.gms.common.api.Scope(1, "https://www.googleapis.com/auth/games");
        defpackage.zye zyeVar = new defpackage.zye();
        zyeVar.b();
        zyeVar.a.add(scope);
        e = zyeVar.a();
        defpackage.zye zyeVar2 = new defpackage.zye();
        zyeVar2.c(scope2, new com.google.android.gms.common.api.Scope[0]);
        zyeVar2.a();
        CREATOR = new defpackage.xkh(17);
        f = new cph(9);
    }

    public GoogleSignInOptions(int i, java.util.ArrayList arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3) {
        this.g = i;
        this.h = arrayList;
        this.i = account;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = str;
        this.n = str2;
        this.o = new java.util.ArrayList(map.values());
        this.p = str3;
    }

    public static java.util.Map b(java.util.List list) {
        java.util.HashMap map = new java.util.HashMap();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(java.lang.Integer.valueOf(googleSignInOptionsExtensionParcelable.b), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    public final java.util.ArrayList a() {
        return new java.util.ArrayList(this.h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
            if (!this.o.isEmpty() || !googleSignInOptions.o.isEmpty()) {
                return false;
            }
            java.util.ArrayList arrayList = this.h;
            if (arrayList.size() != googleSignInOptions.a().size() || !arrayList.containsAll(googleSignInOptions.a())) {
                return false;
            }
            android.accounts.Account account = this.i;
            if (account == null) {
                if (googleSignInOptions.i != null) {
                    return false;
                }
            } else if (!account.equals(googleSignInOptions.i)) {
                return false;
            }
            java.lang.String str = this.m;
            if (android.text.TextUtils.isEmpty(str)) {
                if (!android.text.TextUtils.isEmpty(googleSignInOptions.m)) {
                    return false;
                }
            } else if (!str.equals(googleSignInOptions.m)) {
                return false;
            }
            return this.l == googleSignInOptions.l && this.j == googleSignInOptions.j && this.k == googleSignInOptions.k && android.text.TextUtils.equals(this.p, googleSignInOptions.p);
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((com.google.android.gms.common.api.Scope) arrayList2.get(i)).b);
        }
        java.util.Collections.sort(arrayList);
        xm xmVar = new xm((byte[]) null);
        xmVar.d(arrayList);
        xmVar.d(this.i);
        xmVar.d(this.m);
        xmVar.c(this.l);
        xmVar.c(this.j);
        xmVar.c(this.k);
        xmVar.d(this.p);
        return xmVar.a;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.g);
        aais.E(parcel, 2, a());
        aais.z(parcel, 3, this.i, i);
        aais.h(parcel, 4, this.j);
        aais.h(parcel, 5, this.k);
        aais.h(parcel, 6, this.l);
        aais.A(parcel, 7, this.m);
        aais.A(parcel, 8, this.n);
        aais.E(parcel, 9, this.o);
        aais.A(parcel, 10, this.p);
        aais.g(parcel, iF);
    }
}
