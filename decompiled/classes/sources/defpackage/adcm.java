package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adcm {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;
    public java.lang.Object i;

    public adcm(byte[] bArr) {
        defpackage.aoke aokeVar = defpackage.aoke.a;
        this.f = aokeVar;
        this.e = aokeVar;
        this.g = aokeVar;
        this.c = aokeVar;
    }

    public final defpackage.adcn a() {
        defpackage.ahvr.cj(this.a, "Must call setContext() before build().");
        defpackage.ahvr.cj(this.b, "Must call setManifestFileFlagSupplier() before build().");
        defpackage.ahvr.cj(this.c, "Must call setFileDownloader() before build().");
        defpackage.ahvr.cj(this.h, "Must call setManifestConfigParser() before build().");
        defpackage.ahvr.cj(this.d, "Must call setFileStorage() before build().");
        defpackage.ahvr.cj(this.e, "Must call setBackgroundExecutor() before build().");
        defpackage.ahvr.cj(this.g, "Must call setProtoDataStoreFactory() or setMetadataStore() before build().");
        defpackage.ahvr.cj(this.i, "Must call setLogger() before build().");
        return new defpackage.adcn(this);
    }

    public final void b(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v16, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.Set] */
    public final defpackage.zao c() {
        java.lang.Object obj = this.h;
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Default CUI mapping must be set.");
        }
        defpackage.aacy aacyVar = (defpackage.aacy) obj;
        java.lang.Object obj2 = aacyVar.b;
        if (obj2 == null) {
            throw new java.lang.IllegalArgumentException("default cui must be set.");
        }
        java.lang.Object obj3 = this.i;
        if (obj3 == null) {
            throw new java.lang.IllegalArgumentException("startEvent must be set.");
        }
        if (this.a != null) {
            if (!this.f.isEmpty()) {
                throw new java.lang.IllegalStateException("The endEvent should only be used when there is a single end event.");
            }
            defpackage.mdr mdrVar = new defpackage.mdr(this, 14);
            defpackage.aacy aacyVar2 = new defpackage.aacy();
            mdrVar.a(aacyVar2);
            java.util.Set setSingleton = java.util.Collections.singleton(aacyVar2);
            defpackage.aooh.e(setSingleton, "singleton(...)");
            this.f = setSingleton;
        }
        if (this.b != null) {
            if (!this.e.isEmpty()) {
                throw new java.lang.IllegalStateException("The multiEventEnd should only be used when there is a single multi-event end.");
            }
            defpackage.mdr mdrVar2 = new defpackage.mdr(this, 15);
            defpackage.aacy aacyVar3 = new defpackage.aacy();
            mdrVar2.a(aacyVar3);
            java.util.Set setSingleton2 = java.util.Collections.singleton(aacyVar3);
            defpackage.aooh.e(setSingleton2, "singleton(...)");
            this.e = setSingleton2;
        }
        if (this.f.isEmpty() && this.e.isEmpty()) {
            throw new java.lang.IllegalStateException("CuiEventConfiguration must contain at least 1 end event.");
        }
        ?? r3 = this.f;
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r3, 10));
        java.util.Iterator it = r3.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.aacy) it.next()).b);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList) {
            if (obj4 != null) {
                arrayList2.add(obj4);
            }
        }
        java.util.Set setCf = defpackage.ajsz.cf(arrayList2);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (defpackage.aacy aacyVar4 : this.f) {
            java.lang.Object obj5 = aacyVar4.a;
            if (obj5 == null) {
                obj5 = obj2;
            }
            java.lang.Object obj6 = aacyVar4.b;
            if (obj6 == null) {
                throw new java.lang.IllegalArgumentException("cuiEvent must be set.");
            }
            defpackage.aaif aaifVar = (defpackage.aaif) obj5;
            ?? r10 = aaifVar.b;
            int i = aaifVar.a;
            linkedHashMap.put(obj6, new defpackage.zan((defpackage.aenj) aaifVar.c, i, r10, defpackage.zar.OK));
        }
        for (defpackage.aacy aacyVar5 : this.e) {
            ?? r8 = aacyVar5.b;
            if (r8 == 0 || r8.isEmpty()) {
                throw new java.lang.IllegalArgumentException("cuiEvents must be set.");
            }
            if (r8.size() < 2) {
                throw new java.lang.IllegalArgumentException("More than one CUI is required for multiPointEnd.");
            }
            if (!defpackage.ajsz.cd(r8, setCf).isEmpty()) {
                throw new java.lang.IllegalArgumentException("An end event must not be in multiEventEndSet.");
            }
            java.lang.Object obj7 = aacyVar5.a;
            if (obj7 == null) {
                obj7 = obj2;
            }
            defpackage.zar zarVar = defpackage.zar.OK;
            defpackage.aaif aaifVar2 = (defpackage.aaif) obj7;
            linkedHashSet.add(new defpackage.zam(r8, new defpackage.zan((defpackage.aenj) aaifVar2.c, aaifVar2.a, aaifVar2.b, zarVar)));
        }
        for (defpackage.ajni ajniVar : this.c) {
            java.lang.Object obj8 = ajniVar.a;
            if (obj8 == null) {
                obj8 = obj2;
            }
            java.lang.Object obj9 = ajniVar.b;
            if (obj9 == null) {
                throw new java.lang.IllegalArgumentException("cuiError must be set.");
            }
            java.lang.Object obj10 = ajniVar.c;
            if (obj10 == null) {
                throw new java.lang.IllegalArgumentException("errorCode must be set.");
            }
            defpackage.aaif aaifVar3 = (defpackage.aaif) obj8;
            ?? r11 = aaifVar3.b;
            linkedHashMap2.put(obj9, new defpackage.zan((defpackage.aenj) aaifVar3.c, aaifVar3.a, r11, (defpackage.zar) obj10));
        }
        defpackage.aaif aaifVar4 = (defpackage.aaif) obj2;
        ?? r4 = aaifVar4.b;
        int i2 = aaifVar4.a;
        defpackage.aenj aenjVar = (defpackage.aenj) aaifVar4.c;
        linkedHashMap2.put(defpackage.zak.a, new defpackage.zan(aenjVar, i2, r4, defpackage.zar.CRASH));
        linkedHashMap2.put(defpackage.zak.b, new defpackage.zan(aenjVar, i2, r4, defpackage.zar.CUI_TIMEOUT));
        if (!defpackage.ajsz.cd(linkedHashMap.keySet(), this.g).isEmpty()) {
            throw new java.lang.IllegalStateException("CuiEvent cannot be set as both end and cancel events.");
        }
        if (linkedHashMap.containsKey(obj3)) {
            throw new java.lang.IllegalStateException("CuiEvent cannot be set as both start and end events.");
        }
        if (this.g.contains(obj3)) {
            throw new java.lang.IllegalStateException("CuiEvent cannot be set as both start and cancel events.");
        }
        for (defpackage.aacy aacyVar6 : aacyVar.a) {
            if (aacyVar6.a == null) {
                throw new java.lang.IllegalStateException("CUI must be set.");
            }
            if (aacyVar6.b.isEmpty()) {
                throw new java.lang.IllegalStateException("Events must be added to the defining events set.");
            }
        }
        return new defpackage.zao((defpackage.mce) obj3, this.g, defpackage.ajsz.aS(linkedHashMap), linkedHashSet, aacyVar.a, defpackage.ajsz.aS(linkedHashMap2), (j$.time.Duration) this.d);
    }

    public final void d(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("<set-?>");
        }
        this.g = set;
    }

    public final void e(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("<set-?>");
        }
        this.f = set;
    }

    public final void f(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("<set-?>");
        }
        this.c = set;
    }

    public final void g(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("<set-?>");
        }
        this.e = set;
    }

    public adcm() {
        this.f = defpackage.ahwt.a;
        new defpackage.adcl(this, 0);
    }
}
