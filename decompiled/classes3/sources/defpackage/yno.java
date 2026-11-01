package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yno {
    private final java.lang.String a;
    private final aify b;
    private final aify c;
    private final aigf d;
    private final java.lang.String e;
    private final int f;

    public yno(int i, java.lang.String str, aify aifyVar, aify aifyVar2, aigf aigfVar, java.lang.String str2) {
        this.f = i;
        this.a = str;
        this.b = aifyVar;
        this.c = aifyVar2;
        this.d = aigfVar;
        this.e = str2;
    }

    final com.google.android.apps.aicore.aidl.ResponseSchema a() {
        int i;
        defpackage.ylz ylzVarA = com.google.android.apps.aicore.aidl.ResponseSchema.a();
        int i2 = this.f;
        if (i2 != 0) {
            int i3 = i2 - 1;
            if (i3 == 0) {
                i = 0;
            } else if (i3 != 1) {
                i = 2;
                if (i3 != 2) {
                    i = 3;
                    if (i3 != 3) {
                        if (i3 != 4) {
                            i = 5;
                            if (i3 != 5) {
                                i = 6;
                            }
                        } else {
                            i = 4;
                        }
                    }
                }
            } else {
                i = 1;
            }
            ylzVarA.b(i);
        }
        java.lang.String str = this.a;
        if (str != null) {
            ylzVarA.a = str;
        }
        aify aifyVar = this.b;
        if (aifyVar != null) {
            ylzVarA.c = aifyVar;
        }
        java.lang.String str2 = this.e;
        if (str2 != null) {
            ylzVarA.h = str2;
        }
        aify aifyVar2 = this.c;
        if (aifyVar2 != null) {
            ylzVarA.e = aifyVar2;
        }
        aigf aigfVar = this.d;
        if (aigfVar != null) {
            aigb aigbVar = new aigb(4);
            ailj ailjVarK = aigfVar.e().k();
            while (ailjVarK.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                aigbVar.i((java.lang.String) entry.getKey(), ((defpackage.yno) entry.getValue()).a());
            }
            ylzVarA.i = aigbVar.e(true);
        }
        return ylzVarA.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yno) {
            defpackage.yno ynoVar = (defpackage.yno) obj;
            int i = this.f;
            if (i != 0 ? i == ynoVar.f : ynoVar.f == 0) {
                java.lang.String str = this.a;
                if (str != null ? str.equals(ynoVar.a) : ynoVar.a == null) {
                    aify aifyVar = this.b;
                    if (aifyVar != null ? ahvr.aP(aifyVar, ynoVar.b) : ynoVar.b == null) {
                        aify aifyVar2 = this.c;
                        if (aifyVar2 != null ? ahvr.aP(aifyVar2, ynoVar.c) : ynoVar.c == null) {
                            aigf aigfVar = this.d;
                            if (aigfVar != null ? aigfVar.equals(ynoVar.d) : ynoVar.d == null) {
                                java.lang.String str2 = this.e;
                                if (str2 == null) {
                                    if (ynoVar.e == null) {
                                        return true;
                                    }
                                } else if (str2.equals(ynoVar.e)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            i = 0;
        }
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i2 = (i ^ 1000003) * 1000003;
        aify aifyVar = this.b;
        int iHashCode2 = aifyVar == null ? 0 : aifyVar.hashCode();
        int i3 = i2 ^ iHashCode;
        aify aifyVar2 = this.c;
        int iHashCode3 = ((((i3 * 583896283) ^ iHashCode2) * 1525764945) ^ (aifyVar2 == null ? 0 : aifyVar2.hashCode())) * 1000003;
        aigf aigfVar = this.d;
        int iHashCode4 = iHashCode3 ^ (aigfVar == null ? 0 : aigfVar.hashCode());
        java.lang.String str2 = this.e;
        return (iHashCode4 * 72493609) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        switch (this.f) {
            case 1:
                str = "UNSPECIFIED";
                break;
            case 2:
                str = "STRING";
                break;
            case 3:
                str = "NUMBER";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "INTEGER";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "BOOLEAN";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "ARRAY";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str = "OBJECT";
                break;
            default:
                str = "null";
                break;
        }
        java.lang.String str2 = this.a;
        aify aifyVar = this.b;
        aify aifyVar2 = this.c;
        aigf aigfVar = this.d;
        java.lang.String str3 = this.e;
        return "LlmResponseSchema{type=" + str + ", format=" + str2 + ", description=null, nullable=null, enumValues=" + java.lang.String.valueOf(aifyVar) + ", items=null, maxItems=null, minItems=null, required=" + java.lang.String.valueOf(aifyVar2) + ", properties=" + java.lang.String.valueOf(aigfVar) + ", minProperties=null, maxProperties=null, minimum=null, maximum=null, minLength=null, maxLength=null, pattern=null, anyOf=null, propertyOrdering=null, title=" + str3 + '}';
    }

    public yno() {
        throw null;
    }
}
