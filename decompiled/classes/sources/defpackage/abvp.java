package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abvp {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/contacts/callingcard/impl/CallingCardRepositoryV2Impl");
    public final android.content.Context b;
    public final defpackage.aarf c;
    public final defpackage.aolr d;
    public final defpackage.aabx e;
    private final defpackage.aoir f;
    private final defpackage.aoir g;
    private final defpackage.aoir h;
    private final defpackage.aoir i;

    public abvp(android.content.Context context, defpackage.aarf aarfVar, defpackage.aolr aolrVar, defpackage.aabx aabxVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (aabxVar == null) {
            defpackage.aooh.i("googleApiAvailability");
        }
        this.b = context;
        this.c = aarfVar;
        this.d = aolrVar;
        this.e = aabxVar;
        this.f = new defpackage.aoiy(new defpackage.uob(this, 18));
        this.g = new defpackage.aoiy(new defpackage.uob(this, 19));
        this.h = new defpackage.aoiy(new defpackage.uob(this, 20));
        this.i = new defpackage.aoiy(new defpackage.acik(this, 1));
    }

    public final defpackage.abux a() {
        return (defpackage.abux) this.f.a();
    }

    public final java.lang.Object b(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.gbm(this, (defpackage.aoln) null, 12), aolnVar);
    }

    public final java.lang.Object c(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new abvk(this, (defpackage.aoln) null, 0), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object d(abup abupVar, com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier, android.os.ParcelFileDescriptor parcelFileDescriptor, android.net.Uri uri, amjp amjpVar, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.aoln aolnVar) throws java.lang.Exception {
        abvl abvlVar;
        com.google.android.gms.people.cpg.callingcard.v2.FileData fileData;
        com.google.android.gms.people.cpg.callingcard.v2.Metadata metadata;
        com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData fullScreenImageData;
        com.google.android.gms.people.cpg.callingcard.v2.FontData fontData;
        com.google.android.gms.people.cpg.callingcard.v2.FontColor fontColor;
        java.lang.Float f;
        java.lang.Float f2;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Float fValueOf;
        java.lang.Float fValueOf2;
        amjs amjsVarY;
        if (aolnVar instanceof abvl) {
            abvlVar = (abvl) aolnVar;
            int i = abvlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abvlVar.c = i - Integer.MIN_VALUE;
            } else {
                abvlVar = new abvl(this, aolnVar);
            }
        } else {
            abvlVar = new abvl(this, aolnVar);
        }
        java.lang.Object objY = abvlVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = abvlVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objY);
            if (parcelFileDescriptor == null || uri == null) {
                fileData = null;
            } else {
                java.lang.String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "temp.jpeg";
                }
                fileData = new com.google.android.gms.people.cpg.callingcard.v2.FileData(parcelFileDescriptor, lastPathSegment, str3);
            }
            int i3 = abupVar.f;
            com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier2 = identifier == null ? null : identifier;
            if (fileData == null) {
                fileData = null;
            }
            if (amjpVar != null) {
                amjn amjnVarW = ajee.w(amjpVar);
                if (amjnVarW == null || (amjsVarY = ajee.y(amjnVarW)) == null) {
                    fullScreenImageData = null;
                } else {
                    amjs amjsVar = 1 != (amjsVarY.b & 1) ? null : amjsVarY;
                    java.lang.Float fValueOf3 = amjsVar != null ? java.lang.Float.valueOf(amjsVar.c) : null;
                    amjs amjsVar2 = (amjsVarY.b & 2) == 0 ? null : amjsVarY;
                    java.lang.Float fValueOf4 = amjsVar2 != null ? java.lang.Float.valueOf(amjsVar2.d) : null;
                    if ((amjsVarY.b & 4) == 0) {
                        amjsVarY = null;
                    }
                    fullScreenImageData = new com.google.android.gms.people.cpg.callingcard.v2.FullScreenImageData(fValueOf3, fValueOf4, amjsVarY != null ? java.lang.Float.valueOf(amjsVarY.e) : null);
                }
                amjr amjrVarX = ajee.x(amjpVar);
                if (amjrVarX != null) {
                    if (defpackage.abts.e(amjrVarX)) {
                        amml ammlVar = amjrVarX.c;
                        if (ammlVar == null) {
                            ammlVar = amml.a;
                        }
                        defpackage.aooh.e(ammlVar, "getColor(...)");
                        float f3 = ammlVar.c;
                        float f4 = ammlVar.e;
                        float f5 = ammlVar.d;
                        if ((ammlVar.b & 1) != 0) {
                            akzv akzvVar = ammlVar.f;
                            if (akzvVar == null) {
                                akzvVar = akzv.a;
                            }
                            fValueOf2 = java.lang.Float.valueOf(akzvVar.b);
                        } else {
                            fValueOf2 = null;
                        }
                        fontColor = new com.google.android.gms.people.cpg.callingcard.v2.FontColor(f3, f5, f4, fValueOf2);
                    } else {
                        fontColor = null;
                    }
                    if (defpackage.abts.f(amjrVarX)) {
                        amjr amjrVar = (amjrVarX.b & 2) == 0 ? null : amjrVarX;
                        java.lang.Float fValueOf5 = amjrVar != null ? java.lang.Float.valueOf(amjrVar.d) : null;
                        amjr amjrVar2 = (amjrVarX.b & 4) == 0 ? null : amjrVarX;
                        java.lang.Float fValueOf6 = amjrVar2 != null ? java.lang.Float.valueOf(amjrVar2.e) : null;
                        amjr amjrVar3 = (amjrVarX.b & 8) == 0 ? null : amjrVarX;
                        java.lang.Integer numValueOf = amjrVar3 != null ? java.lang.Integer.valueOf(amjrVar3.f) : null;
                        amjr amjrVar4 = (amjrVarX.b & 16) == 0 ? null : amjrVarX;
                        java.lang.Integer numValueOf2 = amjrVar4 != null ? java.lang.Integer.valueOf(amjrVar4.g) : null;
                        if ((amjrVarX.b & 32) == 0) {
                            amjrVarX = null;
                        }
                        fValueOf = amjrVarX != null ? java.lang.Float.valueOf(amjrVarX.h) : null;
                        f2 = fValueOf6;
                        num = numValueOf;
                        num2 = numValueOf2;
                        f = fValueOf5;
                    } else {
                        f = null;
                        f2 = null;
                        num = null;
                        num2 = null;
                        fValueOf = null;
                    }
                    fontData = new com.google.android.gms.people.cpg.callingcard.v2.FontData(fontColor, f, f2, num, num2, fValueOf);
                } else {
                    fontData = null;
                }
                metadata = new com.google.android.gms.people.cpg.callingcard.v2.Metadata(fontData, fullScreenImageData);
            } else {
                metadata = null;
            }
            defpackage.aaum aaumVarH = this.c.h(new com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardRequest(i3, identifier2, fileData, metadata, str == null ? null : str, str2 != null ? str2 : null));
            abvlVar.c = 1;
            objY = defpackage.aooh.Y(aaumVarH, abvlVar);
            if (objY == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objY);
        }
        defpackage.aooh.e(objY, "await(...)");
        return objY;
    }

    public final java.util.List e(java.util.List list) {
        boolean z;
        boolean zF = f();
        boolean zH = h();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            abuw abuwVar = (abuw) obj;
            j$.util.Objects.checkIndex(0, 4);
            if (abuwVar != null) {
                if (abuwVar instanceof abuu) {
                    z = true;
                } else if (abuwVar instanceof abuv) {
                    z = zF;
                } else if (abuwVar instanceof abut) {
                    z = zH;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            throw new defpackage.aois();
        }
        return arrayList;
    }

    public final boolean f() {
        return ((java.lang.Boolean) this.h.a()).booleanValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) this.g.a()).booleanValue();
    }

    public final boolean h() {
        return ((java.lang.Boolean) this.i.a()).booleanValue();
    }

    public final java.lang.Object i(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new abvg(list, this, (defpackage.aoln) null, 2), aolnVar);
    }

    public final java.lang.Object j(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new abvg(list, this, (defpackage.aoln) null, 3, (byte[]) null), aolnVar);
    }
}
