package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kdy {
    public final defpackage.ked A;
    public final java.lang.String B;
    public final java.lang.String C;
    public final java.lang.String D;
    private final aoir E = aooc.ag(new defpackage.jaj(this, 13));
    private final aoir F = aooc.ag(new defpackage.jaj(this, 17));
    private final aoir G = aooc.ag(new defpackage.jaj(this, 18));
    private final aoir H = aooc.ag(new defpackage.jaj(this, 19));
    private final aoir I = aooc.ag(new defpackage.jaj(this, 20));
    private final aoir J = aooc.ag(new defpackage.jaj(this, 8));
    private final aoir K = aooc.ag(new defpackage.jaj(this, 9));
    private final aoir L = aooc.ag(new defpackage.jaj(this, 10));
    private final aoir M = aooc.ag(new defpackage.jaj(this, 11));
    private final aoir N = aooc.ag(new defpackage.jaj(this, 12));
    private final aoir O = aooc.ag(new defpackage.jaj(this, 14));
    private final aoir P = aooc.ag(new defpackage.jaj(this, 15));
    private final aoir Q = aooc.ag(new defpackage.jaj(this, 16));
    public final long a;
    public final long b;
    public final defpackage.ked c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final java.lang.String k;
    public final int l;
    public final defpackage.ked m;
    public final boolean n;
    public final java.lang.String o;
    public final int p;
    public final long q;
    public final long r;
    public final java.lang.String s;
    public final defpackage.ked t;
    public final defpackage.ked u;
    public final defpackage.ked v;
    public final defpackage.ked w;
    public final defpackage.ked x;
    public final defpackage.ked y;
    public final defpackage.ked z;

    public kdy(long j, long j2, defpackage.ked kedVar, java.lang.String str, java.lang.String str2, int i, boolean z, boolean z2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2, defpackage.ked kedVar2, boolean z3, java.lang.String str6, int i3, long j3, long j4, java.lang.String str7, defpackage.ked kedVar3, defpackage.ked kedVar4, defpackage.ked kedVar5, defpackage.ked kedVar6, defpackage.ked kedVar7, defpackage.ked kedVar8, defpackage.ked kedVar9, defpackage.ked kedVar10, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        this.a = j;
        this.b = j2;
        this.c = kedVar;
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = i2;
        this.m = kedVar2;
        this.n = z3;
        this.o = str6;
        this.p = i3;
        this.q = j3;
        this.r = j4;
        this.s = str7;
        this.t = kedVar3;
        this.u = kedVar4;
        this.v = kedVar5;
        this.w = kedVar6;
        this.x = kedVar7;
        this.y = kedVar8;
        this.z = kedVar9;
        this.A = kedVar10;
        this.B = str8;
        this.C = str9;
        this.D = str10;
    }

    public final android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("_id", java.lang.Long.valueOf(this.a));
        contentValues.put("timestamp", java.lang.Long.valueOf(this.b));
        contentValues.put("number", this.c.b);
        contentValues.put("raw_number", this.d);
        contentValues.put("formatted_number", this.e);
        contentValues.put("presentation", java.lang.Integer.valueOf(this.f));
        contentValues.put("is_read", java.lang.Integer.valueOf(this.g ? 1 : 0));
        contentValues.put("new", java.lang.Integer.valueOf(this.h ? 1 : 0));
        contentValues.put("geocoded_location", this.i);
        contentValues.put("phone_account_component_name", this.j);
        contentValues.put("phone_account_id", this.k);
        contentValues.put("features", java.lang.Integer.valueOf(this.l));
        contentValues.put("number_attributes", this.m.b);
        contentValues.put("is_voicemail_call", java.lang.Integer.valueOf(this.n ? 1 : 0));
        contentValues.put("voicemail_call_tag", this.o);
        contentValues.put("call_type", java.lang.Integer.valueOf(this.p));
        contentValues.put("data_usage", java.lang.Long.valueOf(this.q));
        contentValues.put("duration", java.lang.Long.valueOf(this.r));
        contentValues.put("call_mapping_id", this.s);
        contentValues.put("spam_status", this.t.b);
        contentValues.put("atlas_call_details", this.u.b);
        contentValues.put("call_screen_details", this.v.b);
        contentValues.put("call_recording_details", this.w.b);
        contentValues.put("fides_details", this.x.b);
        contentValues.put("calling_networks_attributes", this.y.b);
        contentValues.put("xatu_call_details", this.z.b);
        contentValues.put("dobby_calllog_details", this.A.b);
        contentValues.put("name", this.C);
        contentValues.put("uuid", this.B);
        contentValues.put("lookup_uri", this.D);
        return contentValues;
    }

    public final defpackage.hkd b() {
        return (defpackage.hkd) this.E.a();
    }

    public final defpackage.jvx c() {
        return (defpackage.jvx) this.L.a();
    }

    public final defpackage.kir d() {
        return (defpackage.kir) this.I.a();
    }

    public final defpackage.kiw e() {
        return (defpackage.kiw) this.F.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kdy) {
            defpackage.kdy kdyVar = (defpackage.kdy) obj;
            if (this.a == kdyVar.a && this.b == kdyVar.b && aooh.n(this.c, kdyVar.c) && aooh.n(this.d, kdyVar.d) && aooh.n(this.e, kdyVar.e) && this.f == kdyVar.f && this.g == kdyVar.g && this.h == kdyVar.h && aooh.n(this.i, kdyVar.i) && aooh.n(this.j, kdyVar.j) && aooh.n(this.k, kdyVar.k) && this.l == kdyVar.l && aooh.n(this.m, kdyVar.m) && this.n == kdyVar.n && aooh.n(this.o, kdyVar.o) && this.p == kdyVar.p && this.q == kdyVar.q && this.r == kdyVar.r && aooh.n(this.s, kdyVar.s) && aooh.n(this.t, kdyVar.t) && aooh.n(this.u, kdyVar.u) && aooh.n(this.v, kdyVar.v) && aooh.n(this.w, kdyVar.w) && aooh.n(this.x, kdyVar.x) && aooh.n(this.y, kdyVar.y) && aooh.n(this.z, kdyVar.z) && aooh.n(this.A, kdyVar.A) && aooh.n(this.B, kdyVar.B) && aooh.n(this.C, kdyVar.C) && aooh.n(this.D, kdyVar.D)) {
                return true;
            }
        }
        return false;
    }

    public final kui f() {
        return (kui) this.J.a();
    }

    public final mmy g() {
        return (mmy) this.N.a();
    }

    public final defpackage.omz h() {
        return (defpackage.omz) this.K.a();
    }

    public final int hashCode() {
        int iM = (((anty.M(this.a) * 31) + anty.M(this.b)) * 31) + this.c.hashCode();
        java.lang.String str = this.d;
        int iHashCode = ((iM * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.e;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f) * 31) + anty.L(this.g)) * 31) + anty.L(this.h)) * 31;
        java.lang.String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.k;
        int iHashCode5 = (((((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.l) * 31) + this.m.hashCode()) * 31) + anty.L(this.n)) * 31;
        java.lang.String str6 = this.o;
        int iHashCode6 = (((((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.p) * 31) + anty.M(this.q)) * 31) + anty.M(this.r)) * 31;
        java.lang.String str7 = this.s;
        int iHashCode7 = (((((((((((((((((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A.hashCode()) * 31;
        java.lang.String str8 = this.B;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.C;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.D;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final ucu i() {
        return (ucu) this.G.a();
    }

    public final wgu j() {
        return (wgu) this.M.a();
    }

    public final wxp k() {
        return (wxp) this.H.a();
    }

    public final akgu l() {
        return (akgu) this.O.a();
    }

    public final java.lang.Boolean m() {
        return (java.lang.Boolean) this.P.a();
    }

    public final java.lang.String n() {
        return (java.lang.String) this.Q.a();
    }

    public final void o() {
        b();
        e();
        i();
        k();
        d();
        f();
        h();
        c();
        j();
        g();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnnotatedCallLogEntry(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", numberBytes=");
        sb.append(this.c);
        sb.append(", rawNumber=");
        sb.append(this.d);
        sb.append(", formattedNumber=");
        sb.append(this.e);
        sb.append(", numberPresentation=");
        sb.append(this.f);
        sb.append(", isRead=");
        sb.append(this.g);
        sb.append(", isNew=");
        sb.append(this.h);
        sb.append(", geocodedLocation=");
        sb.append(this.i);
        sb.append(", phoneAccountComponentName=");
        sb.append(this.j);
        sb.append(", phoneAccountId=");
        sb.append(this.k);
        sb.append(", features=");
        sb.append(this.l);
        sb.append(", numberAttributesBytes=");
        sb.append(this.m);
        sb.append(", isVoicemailCall=");
        sb.append(this.n);
        sb.append(", voicemailCallTag=");
        sb.append(this.o);
        sb.append(", callType=");
        sb.append(this.p);
        sb.append(", dataUsage=");
        sb.append(this.q);
        sb.append(", duration=");
        sb.append(this.r);
        sb.append(", callMappingId=");
        sb.append(this.s);
        sb.append(", spamStatusBytes=");
        sb.append(this.t);
        sb.append(", atlasCallLogDetailsBytes=");
        sb.append(this.u);
        sb.append(", callScreenDetailsBytes=");
        sb.append(this.v);
        sb.append(", callRecordingDetailsBytes=");
        java.lang.String str = this.D;
        java.lang.String str2 = this.C;
        java.lang.String str3 = this.B;
        defpackage.ked kedVar = this.A;
        defpackage.ked kedVar2 = this.z;
        defpackage.ked kedVar3 = this.y;
        defpackage.ked kedVar4 = this.x;
        sb.append(this.w);
        sb.append(", fidesDetailsBytes=");
        sb.append(kedVar4);
        sb.append(", callingNetworksAttributesBytes=");
        sb.append(kedVar3);
        sb.append(", xatuCallDetailsBytes=");
        sb.append(kedVar2);
        sb.append(", dobbyCallLogDetailsBytes=");
        sb.append(kedVar);
        sb.append(", uuid=");
        sb.append(str3);
        sb.append(", cachedName=");
        sb.append(str2);
        sb.append(", cachedLookupUri=");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
