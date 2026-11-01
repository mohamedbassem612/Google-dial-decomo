package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajyk {
    public static volatile defpackage.ajyk a;
    public final java.lang.Object b;

    public ajyk(android.content.Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        java.io.File file = new java.io.File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            android.util.Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "Error creating file in no backup dir: ".concat(java.lang.String.valueOf(e.getMessage())));
            }
        }
    }

    public static int V(defpackage.apdi apdiVar, java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.akzs.a((defpackage.alcr) apdiVar.a, 1, obj) + defpackage.akzs.a((defpackage.alcr) apdiVar.d, 2, obj2);
    }

    public static void W(defpackage.akzk akzkVar, defpackage.apdi apdiVar, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.akzs.f(akzkVar, (defpackage.alcr) apdiVar.a, 1, obj);
        defpackage.akzs.f(akzkVar, (defpackage.alcr) apdiVar.d, 2, obj2);
    }

    private static final java.lang.String X(java.lang.String str, java.lang.String str2) {
        return str + "|T|" + str2 + "|*";
    }

    private final synchronized java.lang.String Y(long j) {
        return j$.util.DateRetargetClass.toInstant(new java.util.Date(j)).atOffset(j$.time.ZoneOffset.UTC).toLocalDateTime().format(j$.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized java.lang.String Z(java.lang.String str) {
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.b.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((java.lang.String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void aa() {
        ?? r0 = this.b;
        long j = r0.getLong("fire-count", 0L);
        java.lang.String key = "";
        java.lang.String str = null;
        for (java.util.Map.Entry<java.lang.String, ?> entry : r0.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                for (java.lang.String str2 : (java.util.Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet(r0.getStringSet(key, new java.util.HashSet()));
        hashSet.remove(str);
        r0.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void ab(java.lang.String str) {
        java.lang.String strZ = Z(str);
        if (strZ == null) {
            return;
        }
        ?? r1 = this.b;
        java.util.HashSet hashSet = new java.util.HashSet(r1.getStringSet(strZ, new java.util.HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            r1.edit().remove(strZ).commit();
        } else {
            r1.edit().putStringSet(strZ, hashSet).commit();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void ac(java.lang.String str, java.lang.String str2) {
        ab(str2);
        java.util.HashSet hashSet = new java.util.HashSet();
        ?? r2 = this.b;
        java.util.HashSet hashSet2 = new java.util.HashSet(r2.getStringSet(str, hashSet));
        hashSet2.add(str2);
        r2.edit().putStringSet(str, hashSet2).commit();
    }

    public final void A(int i, java.lang.Object obj) {
        boolean z = obj instanceof defpackage.akzc;
        java.lang.Object obj2 = this.b;
        if (z) {
            ((defpackage.akzk) obj2).q(i, (defpackage.akzc) obj);
        } else {
            ((defpackage.akzk) obj2).p(i, (defpackage.albh) obj);
        }
    }

    public final void B(int i, int i2) {
        ((defpackage.akzk) this.b).i(i, i2);
    }

    public final void C(int i, long j) {
        ((defpackage.akzk) this.b).k(i, j);
    }

    public final void D(int i, int i2) {
        ((defpackage.akzk) this.b).u(i, (i2 << 1) ^ (i2 >> 31));
    }

    public final void E(int i, long j) {
        ((defpackage.akzk) this.b).w(i, (j << 1) ^ (j >> 63));
    }

    public final void F(int i, java.lang.String str) {
        ((defpackage.akzk) this.b).r(i, str);
    }

    public final void G(int i, int i2) {
        ((defpackage.akzk) this.b).u(i, i2);
    }

    public final void H(int i, long j) {
        ((defpackage.akzk) this.b).w(i, j);
    }

    public final /* synthetic */ defpackage.aktj I() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.b).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.aktj) aladVarR;
    }

    public final void J() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.b;
        akzxVar.u();
        defpackage.aktj aktjVar = (defpackage.aktj) akzxVar.b;
        defpackage.aktj aktjVar2 = defpackage.aktj.a;
        aktjVar.b |= 32768;
        aktjVar.h = true;
    }

    public final /* synthetic */ defpackage.akry K() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.b).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.akry) aladVarR;
    }

    public final void L(defpackage.akra akraVar) {
        defpackage.aooh.f(akraVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.b;
        akzxVar.u();
        defpackage.akry akryVar = (defpackage.akry) akzxVar.b;
        defpackage.akry akryVar2 = defpackage.akry.a;
        j$.util.Objects.requireNonNull(akraVar);
        akryVar.d = akraVar;
        akryVar.b |= 2;
    }

    public final void M() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.b;
        akzxVar.u();
        defpackage.akry akryVar = (defpackage.akry) akzxVar.b;
        defpackage.akry akryVar2 = defpackage.akry.a;
        akryVar.c = 3;
        akryVar.b |= 1;
    }

    public final /* synthetic */ defpackage.akri N() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.b).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.akri) aladVarR;
    }

    public final defpackage.aksb O() {
        defpackage.aksb aksbVar = ((defpackage.akri) ((defpackage.akzx) this.b).b).d;
        if (aksbVar == null) {
            aksbVar = defpackage.aksb.a;
        }
        defpackage.aooh.e(aksbVar, "getUserId(...)");
        return aksbVar;
    }

    public final void P(defpackage.aksb aksbVar) {
        defpackage.aooh.f(aksbVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.b;
        akzxVar.u();
        defpackage.akri akriVar = (defpackage.akri) akzxVar.b;
        defpackage.akri akriVar2 = defpackage.akri.a;
        j$.util.Objects.requireNonNull(aksbVar);
        akriVar.d = aksbVar;
        akriVar.b |= 2;
    }

    public final /* synthetic */ defpackage.akrj Q() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.b).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.akrj) aladVarR;
    }

    public final /* synthetic */ defpackage.alct R() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.akrj) ((defpackage.akzx) this.b).b).f);
        defpackage.aooh.e(listUnmodifiableList, "getRegistrationsList(...)");
        return new defpackage.alct(listUnmodifiableList);
    }

    public final /* synthetic */ void S(java.lang.Iterable iterable) {
        defpackage.aooh.f(iterable, "values");
        defpackage.akzx akzxVar = (defpackage.akzx) this.b;
        akzxVar.u();
        defpackage.akrj akrjVar = (defpackage.akrj) akzxVar.b;
        defpackage.akrj akrjVar2 = defpackage.akrj.a;
        akrjVar.b();
        defpackage.akyl.i(iterable, akrjVar.f);
    }

    public final /* synthetic */ void T() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.b;
        akzxVar.u();
        defpackage.akrj akrjVar = (defpackage.akrj) akzxVar.b;
        defpackage.akrj akrjVar2 = defpackage.akrj.a;
        akrjVar.f = defpackage.albq.a;
    }

    public final java.lang.String U(java.lang.Object obj) {
        java.lang.String string = obj.toString();
        boolean z = false;
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (java.lang.Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                }
            }
            z = true;
        }
        defpackage.ahvr.bR(z, "Invalid key: %s", string);
        return ((java.lang.String) this.b).concat(java.lang.String.valueOf(java.lang.String.valueOf(obj)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    final java.util.Set a() {
        java.util.Set setUnmodifiableSet;
        ?? r1 = this.b;
        synchronized (r1) {
            setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet((java.util.Set) r1);
        }
        return setUnmodifiableSet;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized defpackage.ajxs b(java.lang.String str, java.lang.String str2) {
        defpackage.ajxs ajxsVar;
        try {
            ?? r0 = this.b;
            java.lang.String strX = X(str, str2);
            ajxsVar = null;
            java.lang.String string = r0.getString(strX, null);
            long j = defpackage.ajxs.a;
            if (!android.text.TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                        ajxsVar = new defpackage.ajxs(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (org.json.JSONException e) {
                        android.util.Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                    }
                } else {
                    ajxsVar = new defpackage.ajxs(string, null, 0L);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return ajxsVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void c() {
        this.b.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String string;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = defpackage.ajxs.a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (org.json.JSONException e) {
            android.util.Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        android.content.SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString(X(str, str2), string);
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean e() {
        return this.b.getAll().isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized java.util.List f() {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, ?> entry : this.b.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                java.util.HashSet hashSet = new java.util.HashSet((java.util.Set) entry.getValue());
                hashSet.remove(Y(java.lang.System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new ajvu(entry.getKey(), new java.util.ArrayList(hashSet)));
                }
            }
        }
        j(java.lang.System.currentTimeMillis());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void g() {
        ?? r0 = this.b;
        android.content.SharedPreferences.Editor editorEdit = r0.edit();
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, ?> entry : r0.getAll().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                java.util.Set set = (java.util.Set) entry.getValue();
                java.lang.String strY = Y(java.lang.System.currentTimeMillis());
                java.lang.String key = entry.getKey();
                if (set.contains(strY)) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    hashSet.add(strY);
                    editorEdit.putStringSet(key, hashSet);
                    i++;
                } else {
                    editorEdit.remove(key);
                }
            }
        }
        if (i == 0) {
            editorEdit.remove("fire-count");
        } else {
            editorEdit.putLong("fire-count", i);
        }
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void h() {
        java.lang.String strY = Y(java.lang.System.currentTimeMillis());
        this.b.edit().putString("last-used-date", strY).commit();
        ab(strY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void i(long j, java.lang.String str) {
        ?? r0 = this.b;
        java.lang.String strY = Y(j);
        if (r0.getString("last-used-date", "").equals(strY)) {
            java.lang.String strZ = Z(strY);
            if (strZ == null || strZ.equals(str)) {
                return;
            }
            ac(str, strY);
            return;
        }
        long j2 = r0.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            aa();
            j2 = r0.getLong("fire-count", 0L);
        }
        java.util.HashSet hashSet = new java.util.HashSet(r0.getStringSet(str, new java.util.HashSet()));
        hashSet.add(strY);
        r0.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strY).commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    final synchronized void j(long j) {
        this.b.edit().putLong("fire-global", j).commit();
    }

    final synchronized boolean k(long j, long j2) {
        return Y(j).equals(Y(j2));
    }

    public final synchronized boolean l(long j) {
        return m(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    final synchronized boolean m(long j) {
        ?? r0 = this.b;
        if (!r0.contains("fire-global")) {
            r0.edit().putLong("fire-global", j).commit();
            return true;
        }
        if (k(r0.getLong("fire-global", -1L), j)) {
            return false;
        }
        r0.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final ajpz n() {
        try {
            java.lang.Object obj = this.b;
            defpackage.aogc aogcVarH = obj instanceof defpackage.ajly ? ((defpackage.ajly) obj).a : defpackage.ajmg.a.h((defpackage.ajsz) obj);
            defpackage.akzx akzxVarM = ajpz.a.m();
            java.lang.Object obj2 = aogcVarH.b;
            akzxVarM.u();
            ajpz ajpzVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(obj2);
            ajpzVar.b = (java.lang.String) obj2;
            java.lang.Object obj3 = aogcVarH.c;
            akzxVarM.u();
            ajpz ajpzVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(obj3);
            ajpzVar2.c = (defpackage.akzc) obj3;
            int iE = aftt.E((defpackage.ajfe) aogcVarH.a);
            akzxVarM.u();
            akzxVarM.b.d = defpackage.a.S(iE);
            return akzxVarM.r();
        } catch (java.security.GeneralSecurityException e) {
            throw new defpackage.ajne("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b))), e);
        }
    }

    public final void o(java.lang.Object obj, java.util.concurrent.Executor executor) {
        if (obj != null) {
            ((defpackage.ajbb) this.b).b((java.lang.AutoCloseable) obj, executor);
        }
    }

    public final void p(int i, boolean z) {
        ((defpackage.akzk) this.b).f(i, z);
    }

    public final void q(int i, defpackage.akzc akzcVar) {
        ((defpackage.akzk) this.b).g(i, akzcVar);
    }

    public final void r(int i, double d) {
        ((defpackage.akzk) this.b).I(i, d);
    }

    public final void s(int i, int i2) {
        ((defpackage.akzk) this.b).m(i, i2);
    }

    public final void t(int i, int i2) {
        ((defpackage.akzk) this.b).i(i, i2);
    }

    public final void u(int i, long j) {
        ((defpackage.akzk) this.b).k(i, j);
    }

    public final void v(int i, float f) {
        ((defpackage.akzk) this.b).K(i, f);
    }

    public final void w(int i, java.lang.Object obj, defpackage.albw albwVar) {
        defpackage.akzk akzkVar = (defpackage.akzk) this.b;
        akzkVar.t(i, 3);
        albwVar.m((defpackage.akym) obj, this);
        akzkVar.t(i, 4);
    }

    public final void x(int i, int i2) {
        ((defpackage.akzk) this.b).m(i, i2);
    }

    public final void y(int i, long j) {
        ((defpackage.akzk) this.b).w(i, j);
    }

    public final void z(int i, java.lang.Object obj, defpackage.albw albwVar) {
        defpackage.akym akymVar = (defpackage.akym) obj;
        defpackage.akzk akzkVar = (defpackage.akzk) this.b;
        akzkVar.t(i, 2);
        akzkVar.v(akymVar.e(albwVar));
        albwVar.m(akymVar, this);
    }

    public ajyk(defpackage.alcr alcrVar, java.lang.Object obj, defpackage.alcr alcrVar2, java.lang.Object obj2) {
        this.b = new defpackage.apdi(alcrVar, obj, alcrVar2, obj2);
    }

    public ajyk(java.lang.Object obj) {
        this.b = obj;
    }

    public ajyk(java.lang.Object obj, byte[] bArr) {
        this.b = obj;
    }

    public ajyk(java.lang.String str, byte[] bArr) {
        this.b = str.concat("_");
    }

    public ajyk(android.content.Context context, java.lang.String str) {
        this.b = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public ajyk(defpackage.akzk akzkVar) {
        this.b = akzkVar;
        akzkVar.a = this;
    }

    public ajyk() {
        this.b = new java.util.HashSet();
    }
}
