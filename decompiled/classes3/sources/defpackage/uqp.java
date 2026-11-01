package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uqp implements defpackage.uqj {
    public static final aimz a = aimz.i("com/android/dialer/suggestcontacts/impl/FrequentsSuggestContacts");
    public static final java.lang.String[] b = {"_id", "data2", "data1", "display_name", "display_name_alt", "photo_id", "photo_uri", "photo_thumb_uri", "lookup", "carrier_presence", "contact_id", "data4", "data3"};
    public static final java.lang.String[] c = {"number", "countryiso", "date", "type"};
    public static final java.lang.String[] d = {"lookup"};
    public final android.content.Context e;
    public final ajct f;
    public final ajct g;
    public final defpackage.uqt h;
    public final ojo i;
    private final aoin j;
    private final aoin k;
    private final aoin l;
    private final aoin m;
    private final zrw n;

    public uqp(android.content.Context context, ajct ajctVar, ajct ajctVar2, defpackage.uqt uqtVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, zrw zrwVar, ojo ojoVar) {
        this.e = context;
        this.f = ajctVar;
        this.g = ajctVar2;
        this.h = uqtVar;
        this.j = aoinVar;
        this.k = aoinVar2;
        this.l = aoinVar3;
        this.m = aoinVar4;
        this.n = zrwVar;
        this.i = ojoVar;
    }

    public static double c(int i, defpackage.uqo uqoVar) {
        return 1.0d / ((((double) i) * uqoVar.c) + 1.0d);
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2) {
        java.lang.String strNormalizeNumber = android.telephony.PhoneNumberUtils.normalizeNumber(str);
        java.lang.String numberToE164 = android.telephony.PhoneNumberUtils.formatNumberToE164(strNormalizeNumber, str2);
        return numberToE164 != null ? numberToE164 : strNormalizeNumber;
    }

    public static void h(java.util.Map map, java.lang.String str, double d2) {
        map.put(str, java.lang.Double.valueOf(((java.lang.Double) j$.util.Map.-EL.getOrDefault(map, str, java.lang.Double.valueOf(0.0d))).doubleValue() + d2));
    }

    public static void i(long j, java.util.Map map, java.lang.String str, long j2) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        if (j < 86400000) {
            j$.util.Map.-EL.putIfAbsent(map, str, java.lang.Long.valueOf(j2));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uqt] */
    @Override // defpackage.uqj
    public final ajcq a(int i) {
        defpackage.uqo uqoVarJ = j(1);
        j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Integer.valueOf(i));
        defpackage.uqt uqtVar = this.h;
        j$.util.Objects.requireNonNull(uqtVar);
        defpackage.taj tajVar = new defpackage.taj(uqtVar, 10);
        optionalOf.isPresent();
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(tajVar.a.c(((java.lang.Integer) optionalOf.get()).intValue()));
        ahrv ahrvVarG = ahrv.g((ajcq) (true != optionalOfNullable.isPresent() ? ((defpackage.uqp) new idb(this, 10).a).h.b() : optionalOfNullable.get()));
        uhj uhjVar = new uhj(this, uqoVarJ, 4, (byte[]) null);
        ajct ajctVar = this.g;
        return ahvr.H(ahrvVarG.i(uhjVar, ajctVar).h(new defpackage.uqm(1), ajctVar), new defpackage.tbc(i, 4), ajctVar);
    }

    @Override // defpackage.uqj
    public final ajcq b() {
        zrw zrwVar = this.n;
        ajcq ajcqVarB = zrwVar.b();
        ajcq ajcqVarA = zrwVar.a();
        ahda ahdaVarAk = ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarA});
        defpackage.syg sygVar = new defpackage.syg(ajcqVarB, ajcqVarA, 20);
        ajct ajctVar = this.g;
        return ahvr.I(ahdaVarAk.o(sygVar, ajctVar), new defpackage.udu(this, 5), ajctVar);
    }

    public final double d() {
        return ((java.lang.Long) this.k.a()).longValue() / 100.0d;
    }

    public final ajcq e(defpackage.uqo uqoVar) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/suggestcontacts/impl/FrequentsSuggestContacts", "calculateAndSaveScore", 308, "FrequentsSuggestContacts.java").v("calculateAndSaveScore");
        android.os.UserManager userManager = (android.os.UserManager) this.e.getSystemService(android.os.UserManager.class);
        if (userManager != null && !aa$.ExternalSyntheticApiModelOutline1.m(userManager)) {
            aimzVar.b().l("com/android/dialer/suggestcontacts/impl/FrequentsSuggestContacts", "calculateAndSaveScore", 312, "FrequentsSuggestContacts.java").v("user not unlocked");
            return aiql.z(aike.a);
        }
        ahrv ahrvVarG = ahrv.g(this.h.a());
        uhj uhjVar = new uhj(this, uqoVar, 3, (byte[]) null);
        ajct ajctVar = this.f;
        return ahrvVarG.i(uhjVar, ajctVar).h(new ubc(20), this.g).i(new defpackage.udu(this, 6), ajctVar);
    }

    public final ajcq f(defpackage.uqo uqoVar) {
        return ahvr.F(new defpackage.syg(this, uqoVar, 19, null), this.f);
    }

    public final defpackage.uqo j(int i) {
        if (i - 1 != 0) {
            defpackage.uqn uqnVar = new defpackage.uqn();
            uqnVar.b(((java.lang.Boolean) this.l.a()).booleanValue());
            uqnVar.d(((java.lang.Boolean) this.m.a()).booleanValue());
            uqnVar.c(((java.lang.Long) this.j.a()).longValue() / 100.0d);
            return uqnVar.a();
        }
        defpackage.uqn uqnVar2 = new defpackage.uqn();
        uqnVar2.b(false);
        uqnVar2.d(false);
        uqnVar2.c(0.2d);
        return uqnVar2.a();
    }
}
