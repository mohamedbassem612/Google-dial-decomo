package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adpy implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ adpy(defpackage.adlt adltVar, java.lang.String str, defpackage.adjk adjkVar, int i, int i2) {
        this.$cid = i2;
        this.d = adltVar;
        this.a = str;
        this.c = adjkVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) throws java.io.IOException {
        if (this.$cid != 0) {
            defpackage.adlt adltVar = (defpackage.adlt) this.d;
            java.lang.Object obj2 = adltVar.l;
            java.lang.String str = this.a;
            ((defpackage.adgy) obj2).g(str);
            adltVar.f(str, (defpackage.adjk) this.c, this.b);
            return defpackage.ajcm.a;
        }
        final defpackage.adqb adqbVar = (defpackage.adqb) this.c;
        defpackage.adgl adglVar = new defpackage.adgl() { // from class: adqa
            @Override // defpackage.adgl
            public final com.google.android.libraries.micore.superpacks.SlicingResult a(com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifest, defpackage.adhv adhvVar) {
                defpackage.aihd aihdVar = (defpackage.aihd) adhvVar.a("messagekeys");
                int i = true != adqbVar.e ? 2 : 1;
                android.os.Parcelable.Creator creator = com.google.android.libraries.micore.superpacks.SlicingResult.CREATOR;
                defpackage.adgk adgkVar = new defpackage.adgk();
                adgkVar.c(true);
                defpackage.adpv adpvVar = new defpackage.adpv(aihdVar, 0);
                defpackage.ailk ailkVarListIterator = ((defpackage.aify) superpackManifest.b().values()).listIterator(0);
                defpackage.aift aiftVar = null;
                while (ailkVarListIterator.hasNext()) {
                    com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) ailkVarListIterator.next();
                    if (adpvVar.a(packManifest)) {
                        if (aiftVar == null) {
                            aiftVar = new defpackage.aift(4);
                        }
                        aiftVar.i(packManifest);
                    }
                }
                defpackage.aify aifyVarG = aiftVar == null ? defpackage.aike.a : aiftVar.g();
                for (int i2 = 0; i2 < ((defpackage.aike) aifyVarG).d; i2++) {
                    com.google.android.libraries.micore.superpacks.common.PackManifest packManifest2 = (com.google.android.libraries.micore.superpacks.common.PackManifest) aifyVarG.get(i2);
                    defpackage.adiv adivVarG = com.google.android.libraries.micore.superpacks.common.Slice.g();
                    adivVarG.f(packManifest2);
                    adivVarG.d(i);
                    adgkVar.b(adivVarG.a());
                }
                return adgkVar.a();
            }

            @Override // defpackage.adgl
            public final /* synthetic */ void b() {
            }
        };
        defpackage.adrg adrgVar = adqbVar.h;
        defpackage.ahct ahctVarF = adrgVar.f("registerSlicingStrategy");
        defpackage.aiof aiofVar = defpackage.adhn.a;
        java.lang.Object obj3 = ahctVarF.i;
        java.lang.String str2 = this.a;
        ((defpackage.adgy) obj3).f(str2, adglVar);
        defpackage.adgh adghVar = new defpackage.adgh() { // from class: adpw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.adgh
            public final java.util.Collection a(java.util.Collection collection, java.util.Collection collection2) {
                java.util.HashSet hashSet = new java.util.HashSet();
                defpackage.ailk ailkVarListIterator = ((defpackage.aify) collection2).listIterator(0);
                while (ailkVarListIterator.hasNext()) {
                    com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) ailkVarListIterator.next();
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.adqb.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "addNewAndOverrideSameMergingStrategy", 258, "AudioFileSuperpackProvider.java")).y("New pack %s", packManifest.j());
                    hashSet.add(defpackage.adqb.a(packManifest));
                }
                java.util.HashSet hashSet2 = new java.util.HashSet(collection2);
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    defpackage.adqb adqbVar2 = adqbVar;
                    com.google.android.libraries.micore.superpacks.common.PackManifest packManifest2 = (com.google.android.libraries.micore.superpacks.common.PackManifest) it.next();
                    defpackage.adnv adnvVarA = defpackage.adqb.a(packManifest2);
                    if (!adqbVar2.g.contains(adnvVarA) || hashSet.contains(adnvVarA)) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.adqb.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "addNewAndOverrideSameMergingStrategy", 269, "AudioFileSuperpackProvider.java")).y("Dropping pack %s", packManifest2.j());
                    } else {
                        hashSet2.add(packManifest2);
                    }
                }
                return hashSet2;
            }
        };
        defpackage.ahct ahctVarF2 = adrgVar.f("registerMergingStrategy");
        defpackage.aiof aiofVar2 = defpackage.adhn.a;
        ((defpackage.adgy) ahctVarF2.i).e(str2, adghVar);
        java.util.Set set = defpackage.adik.a;
        return adrgVar.b(new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(str2, this.b), this.d);
    }

    public /* synthetic */ adpy(defpackage.adqb adqbVar, java.lang.String str, int i, defpackage.ajct ajctVar, int i2) {
        this.$cid = i2;
        this.c = adqbVar;
        this.a = str;
        this.b = i;
        this.d = ajctVar;
    }
}
