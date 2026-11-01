package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aagi {
    public final android.accounts.Account a;
    public final java.util.Set b;
    public final java.util.Set c;
    public final java.util.Map d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final defpackage.aatt g;
    public java.lang.Integer h;

    public aagi(android.accounts.Account account, java.util.Set set, java.util.Map map, java.lang.String str, java.lang.String str2, defpackage.aatt aattVar) {
        this.a = account;
        java.util.Set setUnmodifiableSet = set == null ? java.util.Collections.EMPTY_SET : j$.util.DesugarCollections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        map = map == null ? java.util.Collections.EMPTY_MAP : map;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = aattVar == null ? defpackage.aatt.a : aattVar;
        java.util.HashSet hashSet = new java.util.HashSet(setUnmodifiableSet);
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((uzx) it.next()).a;
            hashSet.addAll(null);
        }
        this.c = j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }
}
