package defpackage;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aiap {
    public static final defpackage.aiap a;
    public static final defpackage.aiap b;
    public static final defpackage.aiap c;
    public static final defpackage.aiap d;
    public static final defpackage.aiap e;
    public static final defpackage.aiap f;
    public static final defpackage.aiap g;
    public static final defpackage.aiap h;
    static final defpackage.aiap[] i;
    private static final /* synthetic */ defpackage.aiap[] j;

    static {
        defpackage.aiap aiapVar = new defpackage.aiap("STRONG", 0);
        a = aiapVar;
        defpackage.aiap aiapVar2 = new defpackage.aiap() { // from class: aiaj
            @Override // defpackage.aiap
            public final defpackage.aibu a(defpackage.aiaz aiazVar, defpackage.aibu aibuVar, defpackage.aibu aibuVar2, java.lang.Object obj) {
                defpackage.aibu aibuVarA = super.a(aiazVar, aibuVar, aibuVar2, obj);
                c(aibuVar, aibuVarA);
                return aibuVarA;
            }
        };
        b = aiapVar2;
        defpackage.aiap aiapVar3 = new defpackage.aiap() { // from class: aiak
            @Override // defpackage.aiap
            public final defpackage.aibu a(defpackage.aiaz aiazVar, defpackage.aibu aibuVar, defpackage.aibu aibuVar2, java.lang.Object obj) {
                defpackage.aibu aibuVarA = super.a(aiazVar, aibuVar, aibuVar2, obj);
                d(aibuVar, aibuVarA);
                return aibuVarA;
            }
        };
        c = aiapVar3;
        defpackage.aiap aiapVar4 = new defpackage.aiap() { // from class: aial
            @Override // defpackage.aiap
            public final defpackage.aibu a(defpackage.aiaz aiazVar, defpackage.aibu aibuVar, defpackage.aibu aibuVar2, java.lang.Object obj) {
                defpackage.aibu aibuVarA = super.a(aiazVar, aibuVar, aibuVar2, obj);
                c(aibuVar, aibuVarA);
                d(aibuVar, aibuVarA);
                return aibuVarA;
            }
        };
        d = aiapVar4;
        defpackage.aiap aiapVar5 = new defpackage.aiap("WEAK", 4);
        e = aiapVar5;
        defpackage.aiap aiapVar6 = new defpackage.aiap() { // from class: aiam
            @Override // defpackage.aiap
            public final defpackage.aibu a(defpackage.aiaz aiazVar, defpackage.aibu aibuVar, defpackage.aibu aibuVar2, java.lang.Object obj) {
                defpackage.aibu aibuVarA = super.a(aiazVar, aibuVar, aibuVar2, obj);
                c(aibuVar, aibuVarA);
                return aibuVarA;
            }
        };
        f = aiapVar6;
        defpackage.aiap aiapVar7 = new defpackage.aiap() { // from class: aian
            @Override // defpackage.aiap
            public final defpackage.aibu a(defpackage.aiaz aiazVar, defpackage.aibu aibuVar, defpackage.aibu aibuVar2, java.lang.Object obj) {
                defpackage.aibu aibuVarA = super.a(aiazVar, aibuVar, aibuVar2, obj);
                d(aibuVar, aibuVarA);
                return aibuVarA;
            }
        };
        g = aiapVar7;
        defpackage.aiap aiapVar8 = new defpackage.aiap() { // from class: aiao
            @Override // defpackage.aiap
            public final defpackage.aibu a(defpackage.aiaz aiazVar, defpackage.aibu aibuVar, defpackage.aibu aibuVar2, java.lang.Object obj) {
                defpackage.aibu aibuVarA = super.a(aiazVar, aibuVar, aibuVar2, obj);
                c(aibuVar, aibuVarA);
                d(aibuVar, aibuVarA);
                return aibuVarA;
            }
        };
        h = aiapVar8;
        j = new defpackage.aiap[]{aiapVar, aiapVar2, aiapVar3, aiapVar4, aiapVar5, aiapVar6, aiapVar7, aiapVar8};
        i = new defpackage.aiap[]{aiapVar, aiapVar2, aiapVar3, aiapVar4, aiapVar5, aiapVar6, aiapVar7, aiapVar8};
    }

    public aiap(java.lang.String str, int i2) {
        super(str, i2);
    }

    static final void c(defpackage.aibu aibuVar, defpackage.aibu aibuVar2) {
        aibuVar2.k(aibuVar.b());
        defpackage.aibt.c(aibuVar.h(), aibuVar2);
        defpackage.aibt.c(aibuVar2, aibuVar.f());
        defpackage.aibt.e(aibuVar);
    }

    static final void d(defpackage.aibu aibuVar, defpackage.aibu aibuVar2) {
        aibuVar2.q(aibuVar.c());
        defpackage.aibt.d(aibuVar.i(), aibuVar2);
        defpackage.aibt.d(aibuVar2, aibuVar.g());
        defpackage.aibt.f(aibuVar);
    }

    public static defpackage.aiap[] values() {
        return (defpackage.aiap[]) j.clone();
    }

    public defpackage.aibu a(defpackage.aiaz aiazVar, defpackage.aibu aibuVar, defpackage.aibu aibuVar2, java.lang.Object obj) {
        return b(aiazVar, obj, aibuVar.a(), aibuVar2);
    }

    final defpackage.aibu b(defpackage.aiaz aiazVar, java.lang.Object obj, int i2, defpackage.aibu aibuVar) {
        switch (ordinal()) {
            case 0:
                return new defpackage.aibe(obj, i2, aibuVar);
            case 1:
                return new aibc(obj, i2, aibuVar);
            case 2:
                return new aibg(obj, i2, aibuVar);
            case 3:
                return new defpackage.aibd(obj, i2, aibuVar);
            case 4:
                return new aibm(aiazVar.h, obj, i2, aibuVar);
            case 5:
                return new aibk(aiazVar.h, obj, i2, aibuVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new aibo(aiazVar.h, obj, i2, aibuVar);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new aibl(aiazVar.h, obj, i2, aibuVar);
            default:
                throw null;
        }
    }
}
